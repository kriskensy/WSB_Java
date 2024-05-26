package pl.kriskensy.cwiczeniowiec;

import javax.swing.*;
import java.awt.*;

public class RozmieszczeniaGridBag {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Przykładowy układ Swing");
        JPanel panel = new JPanel();

        // Ustawienie GridBagLayout
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Ustawienie domyślnych parametrów dla GridBagConstraints
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(3, 3, 3, 3); // Marginesy

        // Dodanie przycisków do panelu z różnymi ustawieniami GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("Przycisk 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JButton("Przycisk 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // Przycisk 3 będzie rozciągnięty na dwa miejsca w siatce
        gbc.gridheight = 1;
        panel.add(new JButton("Przycisk 3"), gbc);

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
