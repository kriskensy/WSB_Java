package pl.kriskensy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Server {
    private static int PORT = 12345;
    private static Set<ClientHandler> clientHandlers = new HashSet<>();
    private static String bestPlayer = "";
    private static int bestScore = 0;

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening on port " + PORT);

            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                synchronized (clientHandlers) {
                    clientHandlers.add(clientHandler);
                }
                clientHandler.start();
            }
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String getBestPlayer() {
        return bestPlayer;
    }

    public static int getBestScore() {
        return bestScore;
    }

    public static synchronized void updateBestPlayer(String playerName, int score) {
        if (score > bestScore) {
            bestScore = score;
            bestPlayer = playerName;
            System.out.println("New best player: " + bestPlayer + ", score: " + bestScore);
        }
    }

    public static synchronized void removeClient(ClientHandler clientHandler) {
        clientHandlers.remove(clientHandler);
    }
}

class ClientHandler extends Thread {
    private Socket socket;
    private String playerName;
    private int numberToGuess;
    private int attempts;

    Random randomNumber = new Random();

    public ClientHandler(Socket socket) {
        this.socket = socket;
        this.numberToGuess = randomNumber.nextInt(10) + 1;
        this.attempts = 0;
        System.out.println("Number to guess: " + numberToGuess);
    }

    public void run() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            writer.println("Welcome to the game!");

            playerName = reader.readLine();
            System.out.println(playerName + " connected.");
            writer.println("Hello " + playerName + "!");

            String text;

            while ((text = reader.readLine()) != null) {

                if (text.equalsIgnoreCase("N")) {
                    writer.println("Finito Bambino!");
                    break;
                }

                attempts++;
                System.out.println("Client guessed: " + text);

                try {
                    int clientGuess = Integer.parseInt(text);
                    if (clientGuess < numberToGuess) {
                        writer.println("Too low");
                    } else if (clientGuess > numberToGuess) {
                        writer.println("Too high");
                    } else {
                        int points = 5 - attempts;
                        writer.println("Correct! The number is " + clientGuess + " and your score is " + points);

                        Server.updateBestPlayer(playerName, points);
                        writer.println("Best player: " + Server.getBestPlayer() + ", score: " + Server.getBestScore());

                        writer.println("Want to guess again? (Y/N)");
                        text = reader.readLine();
                        if (text.equalsIgnoreCase("Y")) {
                            this.numberToGuess = randomNumber.nextInt(10) + 1;
                            this.attempts = 0;
                            System.out.println("Number to guess: " + numberToGuess);
                            writer.println("Lets play once again. Guess a number between 1 and 10");
                        } else {
                            writer.println("Finito Bambino!");
                            break;
                        }
                    }

                } catch (NumberFormatException e) {
                    writer.println("Invalid input");
                }
            }
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            Server.removeClient(this);
            try {
                socket.close();
                System.out.println(playerName + " disconnected");
            } catch (IOException e) {
                System.out.println("Socket closing impossible: " + e.getMessage());
            }
        }
    }
}