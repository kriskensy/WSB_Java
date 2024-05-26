package pl.kriskensy;

import javax.swing.*;
import java.awt.*;

public class Zad5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Moj pierwszy kalkulator");
        frame.setSize(1000, 100);

        JPanel jPanel = new JPanel();

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

        JLabel labelPrzyciskiOperacji = new JLabel("Przyciski operacji:");
        labelPrzyciskiOperacji.setFont(new Font("Serif", Font.PLAIN, 20));

        JButton buttonDodawanie = new JButton("+");
        JButton buttonOdejmowanie = new JButton("-");
        JButton buttonMnozenie = new JButton("*");

        JLabel labelWynikOperacji = new JLabel("Wynik operacji: ???");
        labelWynikOperacji.setFont(new Font("Serif", Font.PLAIN, 20));

        jPanel.add(labelOperand1);
        jPanel.add(poleWprowadzenia1);
        jPanel.add(labelOperand2);
        jPanel.add(poleWprowadzenia2);
        jPanel.add(labelPrzyciskiOperacji);
        jPanel.add(buttonDodawanie);
        jPanel.add(buttonOdejmowanie);
        jPanel.add(buttonMnozenie);
        jPanel.add(labelWynikOperacji);

        frame.getContentPane().add(jPanel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}