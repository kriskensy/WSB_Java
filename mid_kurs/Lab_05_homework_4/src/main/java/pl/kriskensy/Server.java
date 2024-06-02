package pl.kriskensy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class Server {
    private static final int PORT = 12345;
    private static final int JUDGES = 3;
    private static final Set<ClientHandler> clientHandlers = new HashSet<>();
    private static final Set<Integer> scores = new HashSet<>();

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening on port " + PORT);

            while (clientHandlers.size() < JUDGES) {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                synchronized (clientHandlers) {
                    clientHandlers.add(clientHandler);
                }
                clientHandler.start();
            }

            for (ClientHandler clientHandler : clientHandlers) {
                clientHandler.join();
            }

            double average = calculateAverageScore();
            System.out.println("Average score: " + average);

            for (ClientHandler clientHandler : clientHandlers) {
                clientHandler.sendAverageScore(average);
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static synchronized void addScore(int score) {
        scores.add(score);
    }

    private static double calculateAverageScore() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.size();
    }
}

class ClientHandler extends Thread {
    private final Socket socket;
    private PrintWriter writer;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(), true);

            writer.println("Enter your score (0-20): ");
            String text = reader.readLine();

            try {
                int score = Integer.parseInt(text);
                if (score >= 0 && score <= 20) {
                    Server.addScore(score);
                    writer.println("Score received. Waiting for other judges...");
                    System.out.println("Received score: " + score);
                } else {
                    writer.println("Invalid score. Please enter a number between 0 and 20.");
                }
            } catch (NumberFormatException e) {
                writer.println("Invalid input. Please enter a number between 0 and 20.");
            }

        } catch (IOException e) {
            System.out.println("ClientHandler exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void sendAverageScore(double average) {
        writer.println("Average score: " + average);
    }
}
