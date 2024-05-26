package pl.kriskensy;

import javax.swing.*;
import java.awt.*;

public class ZadDom1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setSize(250, 300);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(4, 4, 4, 4);

        JButton buttonDodawanie = new JButton("+");
        JButton buttonOdejmowanie = new JButton("-");
        JButton buttonMnozenie = new JButton("*");
        JButton buttonDzielenie = new JButton("/");
        JButton buttonRownosci = new JButton("=");
        JButton buttonPoPrzecinku = new JButton(".");
        JButton buttonZerowanie = new JButton("C");
        JButton buttonZmianaZnaku = new JButton("+/-");

        JButton buttonLiczba0 = new JButton("0");
        JButton buttonLiczba1 = new JButton("1");
        JButton buttonLiczba2 = new JButton("2");
        JButton buttonLiczba3 = new JButton("3");
        JButton buttonLiczba4 = new JButton("4");
        JButton buttonLiczba5 = new JButton("5");
        JButton buttonLiczba6 = new JButton("6");
        JButton buttonLiczba7 = new JButton("7");
        JButton buttonLiczba8 = new JButton("8");
        JButton buttonLiczba9 = new JButton("9");

        JLabel podajeWynikOperacji = new JLabel("7.02");
        podajeWynikOperacji.setFont(new Font("Serif", Font.PLAIN, 20));

        gbc.gridx = 0;
        gbc.gridy = 0;
        jPanel.add(podajeWynikOperacji, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        jPanel.add(buttonLiczba7, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        jPanel.add(buttonLiczba8, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        jPanel.add(buttonLiczba9, gbc);
        gbc.gridx = 3;
        gbc.gridy = 2;
        jPanel.add(buttonDodawanie, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        jPanel.add(buttonLiczba4, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        jPanel.add(buttonLiczba5, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        jPanel.add(buttonLiczba6, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        jPanel.add(buttonOdejmowanie, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        jPanel.add(buttonLiczba1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        jPanel.add(buttonLiczba2, gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        jPanel.add(buttonLiczba3, gbc);
        gbc.gridx = 3;
        gbc.gridy = 4;
        jPanel.add(buttonMnozenie, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        jPanel.add(buttonZmianaZnaku, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        jPanel.add(buttonLiczba0, gbc);
        gbc.gridx = 2;
        gbc.gridy = 5;
        jPanel.add(buttonPoPrzecinku, gbc);
        gbc.gridx = 3;
        gbc.gridy = 5;
        jPanel.add(buttonDzielenie, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        jPanel.add(buttonZerowanie, gbc);
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        jPanel.add(buttonRownosci, gbc);

        frame.getContentPane().add(jPanel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}