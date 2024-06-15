package pl.kriskensy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String HOSTNAME = "localhost";
    private static final int PORT = 12345;
    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;

    public void run() {
        try {
            socket = new Socket(HOSTNAME, PORT);
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);

            String welcomeMessage = input.readLine();
            System.out.println(welcomeMessage);

            if (login(scanner)) { //todo tu powinno być zaprzeczenie !login(scanner). Gdzies mam blad w implementacji logowania
                System.out.println("Login credentials incorrect.");
                return;
            }

            while (true) {
                System.out.println("1. Display animals");
                System.out.println("2. Add animal");
                System.out.println("3. Edit animal");
                System.out.println("4. Delete animal");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                String option = scanner.nextLine();

                switch (option) {
                    case "1":
                        displayAnimals();
                        break;
                    case "2":
                        addAnimals(scanner);
                        break;
                    case "3":
                        editAnimals(scanner);
                        break;
                    case "4":
                        deleteAnimals(scanner);
                        break;
                    case "5":
                        return;
                    default:
                        System.out.println("Wrong option, try again.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean login(Scanner scanner) {
        System.out.print("LOGIN: ");
        String username = scanner.nextLine();
        System.out.print("PASSWORD: ");
        String password = scanner.nextLine();

        output.println("LOGIN" + username + " " + password);
        //System.out.println(("LOGIN " + username + " " + password));

        try {
            String response = input.readLine();
            //System.out.println("przed sprawdzeniem ifa: "+response);
            return "Login OK".equals(response);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void displayAnimals() {
        output.println("GET");

        try {
            String line;
            while ((line = input.readLine()) != null && !line.isEmpty()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addAnimals(Scanner scanner) {
        System.out.print("Animal data: (species;quantity;implementation data;popularity rating;cost;size;lifespan): ");
        String data = scanner.nextLine();
        output.println("ADD " + data);
    }

    private void editAnimals(Scanner scanner) {
        System.out.print("Choose animal to edit: ");
        String species = scanner.nextLine();
        System.out.print("Animal data: (species;quantity;implementation data;popularity rating;cost;size;lifespan): ");
        String data = scanner.nextLine();
        output.println("EDIT " + species + ";" + data);
    }

    private void deleteAnimals(Scanner scanner) {
        System.out.print("Choose animal to delete: ");
        String species = scanner.nextLine();
        output.println("DELETE " + species);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}