package pl.kriskensy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    private static int PORT = 12345;

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening on port " + PORT);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                new ServerThread(socket).start();
            }
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

class ServerThread extends Thread {
    private Socket socket;
    private int numberToGuess;

    Random randomNumber = new Random();

    public ServerThread(Socket socket) {
        this.socket = socket;
        this.numberToGuess = randomNumber.nextInt(10) + 1;
        System.out.println("Number to guess: " + numberToGuess);
    }

    public void run() {

        try (InputStream input = socket.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input));
             OutputStream output = socket.getOutputStream();
             PrintWriter writer = new PrintWriter(output, true)) {

            writer.println("Welcome to the game!");
            String text;

            while ((text = reader.readLine()) != null) {
                System.out.println("Client guessed: " + text);

                try {
                    int clientGuess = Integer.parseInt(text);
                    if (clientGuess < numberToGuess) {
                        writer.println("Too low");
                    } else if (clientGuess > numberToGuess) {
                        writer.println("Too high");
                    } else {
                        writer.println("Correct! The number is " + clientGuess);
                        break;
                    }

                } catch (NumberFormatException e) {
                    writer.println("Invalid input");
                }
            }
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                System.out.println("Client disconnected");
            } catch (IOException e) {
                System.out.println("Socket closing impossible: " + e.getMessage());
            }
        }
    }
}