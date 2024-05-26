package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Zad5 extends JFrame {
    private JPanel mainPanel;
    private JPanel headerPanel;
    private JTextArea textArea;
    private JButton predictButton;
    private ArrayList<String> predictions;

    public Zad5() {
        setTitle("Predictions");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String sourceFile = "Zad5_predictions.txt";
        predictions = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                predictions.add(line);
            }
            bufferedReader.close();

        } catch (IOException ex) {
            System.out.println("Error!");
        }

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
                if (e.getSource() == predictButton) {

                    Random random = new Random();
                    int index = random.nextInt(predictions.size());
                    textArea.setText(predictions.get(index));
                }
            }
        });

        headerPanel.add(predictButton);
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(textArea, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Zad5().setVisible(true);
            }
        });
    }
}