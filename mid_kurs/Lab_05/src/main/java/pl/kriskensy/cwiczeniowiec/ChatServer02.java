package pl.kriskensy.cwiczeniowiec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer02 {
    private static final int PORT = 12345;
    private static Set<ClientHandler02> clientHandlers = new HashSet<>();

    public static void main(String[] args) {
        System.out.println("Chat server started...");

        try (ServerSocket serverSocket = new ServerSocket(PORT, 50, InetAddress.getByName("0.0.0.0"))) {
            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler02 clientHandler = new ClientHandler02(socket);
                clientHandlers.add(clientHandler);
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void broadcast(String message, ClientHandler02 excludeUser) {
        for (ClientHandler02 client : clientHandlers) {
            if (client != excludeUser) {
                client.sendMessage(message);
            }
        }
    }

    public static synchronized void removeClient(ClientHandler02 clientHandler) {
        clientHandlers.remove(clientHandler);
    }
}

class ClientHandler02 extends Thread {
    private Socket socket;
    private PrintWriter out;
    private String name;

    public ClientHandler02(Socket socket) {
        this.socket = socket;
    }

    public void run() {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Enter your name: ");
            name = in.readLine();
            System.out.println(name + " connected");
            ChatServer02.broadcast(name + " joined the chat", this);

            String message;

            while ((message = in.readLine()) != null) {
                System.out.println(name + ": " + message);
                ChatServer02.broadcast(name + ": " + message, this);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ChatServer02.removeClient(this);
            ChatServer02.broadcast(name + " left the chat", this);
            System.out.println(name + " disconnected");
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }
}