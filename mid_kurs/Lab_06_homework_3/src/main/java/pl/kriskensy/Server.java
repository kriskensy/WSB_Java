package pl.kriskensy;

import java.io.*;
import java.net.*;
import java.sql.*;

public class Server {
    private static final int PORT = 12345;
    private static Connection connection;

    public static void main(String[] args) { //todo - wyswietlanie komunikatow (ich dzielenie od nowej linii ) w polu tekstowym
        //todo - nie dziala poprawnie. Jesli usune separatory to tekst w jednej linii jest okej ale jego podzial nie dziala
        try {
            connection = Main.getConnection();

            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server listening on port: " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected");
                new ClientHandler(clientSocket).start();
            }
        } catch (Exception e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket clientSocket;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        public void run() {
            try (InputStream input = clientSocket.getInputStream();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                 OutputStream output = clientSocket.getOutputStream();
                 PrintWriter writer = new PrintWriter(output, true)) {

                String request;
                while ((request = reader.readLine()) != null) {
                    System.out.println("Received: " + request);
                    handleRequest(request, writer);

                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void handleRequest(String request, PrintWriter writer) {
            try {
                if (request.startsWith("CHECK_CONNECTION")) {

                    writer.println("Connection OK");

                } else if (request.startsWith("ADD_PRODUCT")) {

                    String[] products = request.split(",");
                    String producer = products[1];
                    String name = products[2];
                    int quantity = Integer.parseInt(products[3]);
                    double price = Double.parseDouble(products[4]);

                    String query = "INSERT INTO products (producer, name, quantity, price) VALUES (?, ?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, producer);
                    preparedStatement.setString(2, name);
                    preparedStatement.setInt(3, quantity);
                    preparedStatement.setDouble(4, price);
                    preparedStatement.executeUpdate();
                    writer.println("Product added: Producer: " + producer + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price);
                    //todo
//                    writer.println("Product added:\nProducer: " + producer + "\nName: " + name + "\nQuantity: " + quantity + "\nPrice: " + price);

                } else if (request.startsWith("MODIFY_QUANTITY")) {

                    String[] products = request.split(",");
                    int id = Integer.parseInt(products[1]);
                    int quantity = Integer.parseInt(products[2]);

                    String query = "UPDATE products SET quantity = ? WHERE id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setInt(1, quantity);
                    preparedStatement.setInt(2, id);
                    preparedStatement.executeUpdate();
                    writer.println("Product updated: Id: " + id + ", New quantity: " + quantity);
                    //todo
//                    writer.println("Product updated:\n Id: " + id + "\n New quantity: " + quantity);

                } else if (request.startsWith("REPORT_PROBLEM")) {

                    String problem = request.split(",", 2)[1];
                    System.out.println("Problem reported: " + problem);
                    writer.println("Problem reported: " + problem);

                } else {

                    writer.println("Unknown request");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                writer.println("Error: " + e.getMessage());
            }
        }
    }
}