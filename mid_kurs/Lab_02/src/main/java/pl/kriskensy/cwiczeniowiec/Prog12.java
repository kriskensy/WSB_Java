package pl.kriskensy.cwiczeniowiec;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prog12 extends JFrame {
    private JPanel mainPanel;
    private JPanel controlPanel;
    private JPanel messagePanel;

    public Prog12() {
        setTitle("Moja Aplikacja");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        mainPanel = new JPanel(new BorderLayout());
        controlPanel = new JPanel(new BorderLayout());
        messagePanel = new JPanel();

        controlPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        messagePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        messagePanel.setPreferredSize(new Dimension(100, 100));

        String[] options = {"Opcja 1", "Opcja 2", "Opcja 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        JButton button = new JButton("Przycisk");

        controlPanel.add(comboBox, BorderLayout.WEST);
        controlPanel.add(button, BorderLayout.EAST);

        JLabel messageLabel = new JLabel("Komunikat");
        messagePanel.add(messageLabel);


        mainPanel.add(controlPanel, BorderLayout.NORTH);
        mainPanel.add(messagePanel, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) comboBox.getSelectedItem();
                messageLabel.setText("Wybrana opcja: " + selectedOption);

                Color color = Color.BLACK; // Domyślny kolor, jeśli nie pasuje do żadnej opcji
                switch (selectedOption) {
                    case "Opcja 1":
                        color = Color.RED;
                        break;
                    case "Opcja 2":
                        color = Color.BLUE;
                        break;
                    case "Opcja 3":
                        color = Color.MAGENTA;
                        break;
                }
                messagePanel.setBackground(color);


            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Prog12().setVisible(true);
            }
        });
    }
}
