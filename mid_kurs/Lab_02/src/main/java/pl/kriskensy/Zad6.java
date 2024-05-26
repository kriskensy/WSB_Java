package pl.kriskensy;

import javax.swing.*;
import java.awt.*;

public class Zad6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pierwszy kalkulator");
        frame.setSize(500, 150);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(3, 3, 3, 3);

        JLabel labelOperand1 = new JLabel("Operand 1:");
        labelOperand1.setFont(new Font("Serif", Font.PLAIN, 20));

        JTextArea poleWprowadzenia1 = new JTextArea();
        poleWprowadzenia1.setColumns(8);
        poleWprowadzenia1.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel labelOperand2 = new JLabel("Operand 2:");
        labelOperand2.setFont(new Font("Serif", Font.PLAIN, 20));

        JTextArea poleWprowadzenia2 = new JTextArea();
        poleWprowadzenia2.setColumns(8);
        poleWprowadzenia2.setFont(new Font("Serif", Font.PLAIN, 20));

        JButton buttonDodawanie = new JButton("+");
        JButton buttonOdejmowanie = new JButton("-");
        JButton buttonMnozenie = new JButton("*");

        JLabel labelWynikOperacji = new JLabel("Wynik operacji:");
        labelWynikOperacji.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel podajeWynikOperacji = new JLabel("rezultat");
        podajeWynikOperacji.setFont(new Font("Serif", Font.PLAIN, 20));

        gbc.gridx = 0;
        gbc.gridy = 0;
        jPanel.add(labelOperand1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        jPanel.add(labelOperand2, gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        jPanel.add(labelWynikOperacji, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        jPanel.add(poleWprowadzenia1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        jPanel.add(poleWprowadzenia2, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        jPanel.add(podajeWynikOperacji, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        jPanel.add(buttonDodawanie, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        jPanel.add(buttonOdejmowanie, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        jPanel.add(buttonMnozenie, gbc);


        frame.getContentPane().add(jPanel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}