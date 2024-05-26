package pl.kriskensy;

import javax.swing.*;
import java.awt.*;

public class Zad2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanko 2");
        frame.setSize(500, 500);

        JPanel jPanel = new JPanel();

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.WHITE);
        textArea.setFont(new Font("Serif", Font.PLAIN, 12));

        JButton jButton = new JButton();
        jButton.setText("Przycisk");

        jPanel.add(jButton);
        jPanel.add(new JTextArea("To pole mozna edytowac"));
        jPanel.add(textArea);

        //rozmieszczanie elementow
        jPanel.setLayout(new FlowLayout());
//        jPanel.setLayout(new GridLayout(2, 3));

//        jPanel.setLayout(new BorderLayout());
//        jPanel.add(jButton, BorderLayout.EAST);
//        jPanel.add(new JTextArea("To pole mozna edytowac"), BorderLayout.WEST);
//        jPanel.add(textArea, BorderLayout.SOUTH);

        frame.getContentPane().add(jPanel);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}