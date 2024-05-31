package pl.kriskensy.cwiczeniowiec;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ImageServer03fromFile {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server is listening on port 8080...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             OutputStream out = clientSocket.getOutputStream()) {

            String filename = reader.readLine();
            System.out.println("Client demand: " + filename);

            File file = new File(filename);
            if (!file.exists()) {
                System.out.println("File doesn't exist: " + filename);
                return;
            }

            try (InputStream fileIn = new FileInputStream(file)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fileIn.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
            System.out.println("File sent: " + filename);
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
