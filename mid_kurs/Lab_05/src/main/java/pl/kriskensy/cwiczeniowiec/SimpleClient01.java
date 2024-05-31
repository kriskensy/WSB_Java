package pl.kriskensy.cwiczeniowiec;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient01 {
    public static void main(String[] args) {
        String hostname = "localhost"; //127.0.0.1 loopback
        int port = 12345;

        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String text;
            System.out.println("Enter messages (type 'cya' to exit): ");
            while ((text = consoleReader.readLine()) != null) {
                writer.println(text);
                String response = reader.readLine();
                System.out.println("Server replied: " + response);

                if ("cya".equalsIgnoreCase(text)) {
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
