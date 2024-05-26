package pl.kriskensy.cwiczeniowiec;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TIME {
    public static void main(String[] args) {
        // Utwórz ramkę (okno)
        JFrame frame = new JFrame("Aktualny czas systemowy");

        // Ustaw operację zamknięcia okna
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Utwórz etykietę do wyświetlenia czasu
        JLabel label = new JLabel("Czas: ");
        label.setFont(new Font("arial",Font.ITALIC,20));
        label.setBounds(0,0,600,50);

        // Utwórz przycisk
        JButton button = new JButton("Pokaż czas");
        button.setBounds(200,200,150,50);

        // Dodaj akcję do przycisku
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Pobierz aktualny czas systemowy

                label.setText("Czas: " + "Hello world");
            }
        });

        // Dodaj etykietę i przycisk do ramki
        frame.getContentPane().setLayout(null); // Ustaw layout
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);

        // Ustaw rozmiar okna
        frame.setSize(500, 500);

        // Wyśrodkuj okno na ekranie
        frame.setLocationRelativeTo(null);

        // Wyświetl okno
        frame.setVisible(true);
    }
}