package pl.kriskensy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PredictionServer {
    private static List<String> predictions = new ArrayList<>();

    public static void main(String[] args) {
        int port = 12345;

        loadPredictions("Zad2_predictions.txt");

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server listening on port " + port);

            while (true) {

                try (Socket socket = serverSocket.accept()) {
                    BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                    String request = input.readLine();

                    if ("GetPrediction".equals(request)) {
                        output.println(getRandomPrediction());
                    }
                } catch (IOException e) {
                    System.out.println("Client connection error: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }

    private static void loadPredictions(String filename) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String line;
            while ((line = reader.readLine()) != null) {
                predictions.add(line);
            }
        } catch (IOException e) {
            System.out.println("Predictions loading error: " + e.getMessage());
        }
    }

    private static String getRandomPrediction() {
        Random random = new Random();
        int index = random.nextInt(predictions.size());
        return predictions.get(index);
    }
}