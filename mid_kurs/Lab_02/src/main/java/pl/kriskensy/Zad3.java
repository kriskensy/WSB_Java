package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class Zad3 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        LocalTime localTime = LocalTime.ofInstant(now, ZoneId.of("Europe/Warsaw"));

        JFrame frame = new JFrame("Zadanko 3");
        frame.setSize(500, 500);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        JButton jButton = new JButton();
        jButton.setText("Pokaz czas systemowy");

        JLabel label = new JLabel("Czas systemowy: ");
        label.setFont(new Font("Serif", Font.PLAIN, 20));

        jPanel.add(label, BorderLayout.CENTER);
        jPanel.add(jButton, BorderLayout.NORTH);

        frame.getContentPane().add(jPanel);

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Czas systemowy: " + localTime);
            }
        });

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}