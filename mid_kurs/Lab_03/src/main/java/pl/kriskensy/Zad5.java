package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Zad5 extends JFrame {
    private JTextArea textArea;
    private JButton predictButton;
    private JButton exitButton;

    private String[] predictions = {
            "You will come into a great fortune soon.",
            "A journey you must take will bring you great happiness.",
            "Someone from your past will reappear in your life.",
            "An unexpected opportunity will present itself to you.",
            "Your creativity will lead to success in your endeavors.",
            "A new friendship will blossom into something meaningful.",
            "You will overcome a challenge and emerge stronger.",
            "A change in perspective will lead to a breakthrough.",
            "Good news from afar will bring joy to your heart.",
            "Your kindness will be repaid tenfold in the near future."
    };

    public Zad5() {
        setTitle("Predictions");
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

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
                    int index = random.nextInt(predictions.length);
                    textArea.setText(predictions[index]);

                    Color randomColor = getRandomColor();
                    textArea.setBackground(randomColor);
                }
            }
        });

        exitButton = new JButton("Run away!");

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.add(textArea);
        textArea.setBounds(100, 100, 100, 100);
        mainPanel.add(predictButton);
        predictButton.setBounds(100, 225, 100, 50);
        mainPanel.add(exitButton);
        exitButton.setBounds(100, 350, 100, 50);

        add(mainPanel);
        setVisible(true);
    }

    private Color getRandomColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        return new Color(red, green, blue);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Zad5().setVisible(true);
            }
        });
    }
}