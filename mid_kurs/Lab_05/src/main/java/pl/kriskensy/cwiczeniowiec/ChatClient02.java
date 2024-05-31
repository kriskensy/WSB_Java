package pl.kriskensy.cwiczeniowiec;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient02 {
    private String hostname;
    private int port;
    private String userName;
    private PrintWriter out;
    private BufferedReader in;

    private JFrame frame;
    private JTextArea textArea;
    private JTextField textField;

    public ChatClient02(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
        initializeGUI();
    }

    private void initializeGUI() {
        frame = new JFrame("Chat Client");
        textArea = new JTextArea();
        textArea.setEditable(false);
        textField = new JTextField();

        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(textField, BorderLayout.SOUTH);

        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = textField.getText();

                if (!message.isEmpty()) {
                    textArea.append("Sent: " + message + "\n");
                    out.println(message);
                    textField.setText("");
                }
            }
        });

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void execute() {

        try {
            Socket socket = new Socket(hostname, port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            userName = JOptionPane.showInputDialog(frame, "Enter your name: ");
            out.println(userName);

            new ReadThread().start();

        } catch (UnknownHostException e) {
            System.out.println("Server not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O exception: " + e.getMessage());
        }
    }

    private class ReadThread extends Thread {
        public void run() {

            try {
                String message;
                while ((message = in.readLine()) != null) {
                    textArea.append("Received: " + message + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String hostname = "localhost"; //change it to the server's IP address if running on different machines
        int port = 12345;

        ChatClient02 client = new ChatClient02(hostname, port);
        client.execute();
    }
}
