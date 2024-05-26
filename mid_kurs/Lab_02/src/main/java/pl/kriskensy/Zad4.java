package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class Zad4 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        LocalTime localTimeWarsaw = LocalTime.ofInstant(now, ZoneId.of("Europe/Warsaw"));
        LocalTime localTimeBangkok = LocalTime.ofInstant(now, ZoneId.of("Asia/Bangkok"));
        LocalTime localTimeNewYork = LocalTime.ofInstant(now, ZoneId.of("America/New_York"));
        LocalTime localTimeSydney = LocalTime.ofInstant(now, ZoneId.of("Australia/Sydney"));

        JFrame frame = new JFrame("Zadanko 4");
        frame.setSize(500, 500);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());

        JButton jButton = new JButton();
        jButton.setText("Pokaz czas na swiecie");

        JLabel labelWarsaw = new JLabel("Czas w Warszawie: ");
        labelWarsaw.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel labelBangkok = new JLabel("Czas w Bangkoku: ");
        labelBangkok.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel labelNewYork = new JLabel("Czas w Nowym Jorku: ");
        labelNewYork.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel labelSydney = new JLabel("Czas w Sydney: ");
        labelSydney.setFont(new Font("Serif", Font.PLAIN, 20));

        jPanel.add(jButton);
        jPanel.add(labelWarsaw);
        jPanel.add(labelBangkok);
        jPanel.add(labelNewYork);
        jPanel.add(labelSydney);

        frame.getContentPane().add(jPanel);

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelWarsaw.setText("Czas w Warszawie: " + localTimeWarsaw);
                labelBangkok.setText("Czas w Bangkoku: " + localTimeBangkok);
                labelNewYork.setText("Czas w Nowym Jorku: " + localTimeNewYork);
                labelSydney.setText("Czas w Sydney: " + localTimeSydney);
            }
        });

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}