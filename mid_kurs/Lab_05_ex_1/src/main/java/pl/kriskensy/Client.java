package pl.kriskensy;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String text;
            System.out.println("Enter messages (type 'Q' to exit): ");
            while ((text = consoleReader.readLine()) != null) {
                writer.println(text);
                String response = reader.readLine();
                System.out.println("Server replied: " + response);

                if ("Q".equalsIgnoreCase(text)) {
                    break;
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Server not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
