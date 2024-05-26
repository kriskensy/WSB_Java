package pl.kriskensy;

import javax.swing.*;
import java.awt.*;

public class Zad1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanko 1");
        frame.setSize(500, 500);

        JPanel jPanel = new JPanel();

        JTextArea textArea = new JTextArea("Tego nie mozna edytowac");
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.WHITE);
        textArea.setFont(new Font("Serif", Font.PLAIN, 12));

        JTextArea textArea2 = new JTextArea("To mozna edytowac");
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);
        textArea2.setBackground(Color.WHITE);
        textArea2.setFont(new Font("Serif", Font.PLAIN, 12));

        jPanel.add(new JButton("Przycisk"));
        jPanel.add(textArea);
        jPanel.add(textArea2);

        frame.getContentPane().add(jPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}