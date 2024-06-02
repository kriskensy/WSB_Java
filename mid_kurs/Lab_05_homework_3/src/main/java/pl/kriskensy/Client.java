package pl.kriskensy;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private static int PORT = 12345;
    private static String HOST = "localhost";

    public static void main(String[] args) {

        try (Socket socket = new Socket(HOST, PORT)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String clientGuess;
            String serverResponse;

            System.out.println(reader.readLine());
            System.out.println("Enter your name: ");
            String playerName = consoleReader.readLine();
            writer.println(playerName);

            System.out.println(reader.readLine());
            System.out.println("Guess a number between 1 and 10: ");

            while (true) {
                clientGuess = consoleReader.readLine();
                writer.println(clientGuess);

                serverResponse = reader.readLine().trim();
                System.out.println("Server response: " + serverResponse);

                if (serverResponse.startsWith("Correct!")) {
                    System.out.println(reader.readLine());
                    System.out.println(reader.readLine());
                    clientGuess = consoleReader.readLine();
                    writer.println(clientGuess);

                    if (clientGuess.equalsIgnoreCase("N")) {
                        break;
                    } else if (clientGuess.equalsIgnoreCase("Y")) {
                        System.out.println(reader.readLine());
                    } else {
                        break;
                    }
                } else if (serverResponse.equalsIgnoreCase("Finito Bambino!")) {
                    break;
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Server not found" + e.getLocalizedMessage());
        } catch (IOException e) {
            System.out.println("IO exception" + e.getMessage());
        }
    }
}
