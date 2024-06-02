package pl.kriskensy;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private static final int PORT = 12345;
    private static final String HOST = "localhost";

    public static void main(String[] args) {

        try (Socket socket = new Socket(HOST, PORT)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String serverMessage;

            serverMessage = reader.readLine();
            System.out.println(serverMessage);

            String score = consoleReader.readLine();
            writer.println(score);

            serverMessage = reader.readLine();
            System.out.println(serverMessage);

            serverMessage = reader.readLine();
            System.out.println(serverMessage);

        } catch (UnknownHostException e) {
            System.out.println("Server not found: " + e.getLocalizedMessage());
        } catch (IOException e) {
            System.out.println("IO exception: " + e.getMessage());
        }
    }
}
