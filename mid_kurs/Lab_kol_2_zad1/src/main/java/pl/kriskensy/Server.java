package pl.kriskensy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Server {
    private static final String FILE_PATH = "zoo.txt";
    private static final int PORT = 12345;
    private static Map<String, String> loginCredentials;

    public Server() {
        loginCredentials = new HashMap<>();
        loginCredentials.put("kris", "kris");
    }

    public void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server listening on port " + PORT);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                new ClientHandler(socket).start();
            }
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

            try (InputStream input = socket.getInputStream();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                 OutputStream output = socket.getOutputStream();
                 PrintWriter writer = new PrintWriter(output, true)) {

                writer.println("Hello in ZOO!");

                String text;
                while ((text = reader.readLine()) != null) {

                    if (text.startsWith("LOGIN")) {
                        //System.out.println("serwer dostal dane logowania");
                        handleLogin(text, writer);
                    } else if (text.startsWith("GET")) {
                        getAnimal(writer);
                    } else if (text.startsWith("ADD")) {
                        addAnimal(text);
                    } else if (text.startsWith("EDIT")) {
                        editAnimal(text);
                    } else if (text.startsWith("DELETE")) {
                        deleteAnimal(text);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void handleLogin(String login, PrintWriter writer) {
            String[] loginUserPW = login.split(" ");

            if (loginUserPW.length < 3) {
                writer.println("Invalid login format");
                return;
            }

            String user = loginUserPW[1].trim();
            String password = loginUserPW[2].trim();

            if (loginCredentials.containsKey(user) && loginCredentials.get(password).equals(password)) {
                writer.println("Login OK");
            } else {
                writer.println("Login failed");
            }
        }

        private void getAnimal(PrintWriter writer) {
            try (BufferedReader fileReader = new BufferedReader(new FileReader(FILE_PATH))) {

                String animal;
                while ((animal = fileReader.readLine()) != null) {
                    writer.println(animal);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void addAnimal(String animalADD) {
            String newAnimal = animalADD.substring(4); //usuwa slowo ADD

            try (PrintWriter fileWriter = new PrintWriter(new FileWriter(FILE_PATH, true))) {
                fileWriter.println(newAnimal);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void editAnimal(String animalEdit) {
            String[] animal = animalEdit.split(";", 2); //podzial na gatunek i nowe dane
            String species = animal[0].substring(5); //usuwa slowo EDIT
            String newData = animal[1];

            try {

                Path filePath = Paths.get(FILE_PATH);
                List<String> lines = Files.readAllLines(filePath);
                List<String> updatedLines = new ArrayList<>();

                for (String line : lines) {
                    if (line.startsWith(species + ";")) {//jesli linia zaczyna sie od gatunku
                        updatedLines.add(newData);
                    } else {
                        updatedLines.add(line);
                    }
                }

                Files.write(filePath, updatedLines);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void deleteAnimal(String animalDelete) {
            String species = animalDelete.substring(7); //usuwa slowo DELETE

            try {
                Path filePath = Paths.get(FILE_PATH);
                List<String> lines = Files.readAllLines(filePath);

                try (PrintWriter fileWriter = new PrintWriter(new FileWriter(FILE_PATH))) {
                    for (String line : lines) {
                        if (!line.startsWith(species + ";")) {
                            fileWriter.println(line);
                        }
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
