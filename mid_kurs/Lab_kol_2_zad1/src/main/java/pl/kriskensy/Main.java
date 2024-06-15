package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client();

        Thread serverThread = new Thread(() -> server.startServer());
        Thread clientThread = new Thread(() -> client.run());

        serverThread.start();
        clientThread.start();
    }
}