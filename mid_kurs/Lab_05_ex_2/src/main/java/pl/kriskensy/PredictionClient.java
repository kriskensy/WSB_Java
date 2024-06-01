package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class PredictionClient extends JFrame {
    private JPanel mainPanel;
    private JPanel headerPanel;
    private JTextArea textArea;
    private JButton predictButton;

    public PredictionClient() {
        setTitle("Prediction");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new BorderLayout());
        headerPanel = new JPanel(new FlowLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.WHITE);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));

        predictButton = new JButton("Choose your destiny");

        predictButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String prediction = requestPrediction();

                if (prediction != null) {
                    textArea.setText(prediction);
                } else {
                    textArea.setText("Error while predicting your destiny");
                }
            }
        });

        headerPanel.add(predictButton);
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(textArea, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    private String requestPrediction() {
        String hostname = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(hostname, port);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

            output.println("GetPrediction");
            return input.readLine();
        } catch (IOException e) {
            System.out.println("Connecting to server failed: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PredictionClient().setVisible(true);
            }
        });
    }
}