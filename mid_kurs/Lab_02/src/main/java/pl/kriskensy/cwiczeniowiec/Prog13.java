package pl.kriskensy.cwiczeniowiec;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prog13 extends JFrame {
    private JPanel mainPanel;
    private JPanel checkBoxPanel;
    private JButton button;
    private JPanel messagePanel;

    public Prog13() {
        setTitle("Moja Aplikacja 2");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        mainPanel = new JPanel(new BorderLayout());
        checkBoxPanel = new JPanel(new GridLayout(1, 3)); // Używamy GridLayout
        button = new JButton("Przycisk");
        messagePanel = new JPanel();

        checkBoxPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        messagePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JCheckBox redCheckBox = new JCheckBox("Czerwony");
        JCheckBox blueCheckBox = new JCheckBox("Niebieski");
        JCheckBox yellowCheckBox = new JCheckBox("Żółty");

        checkBoxPanel.add(redCheckBox);
        checkBoxPanel.add(blueCheckBox);
        checkBoxPanel.add(yellowCheckBox);

        JLabel messageLabel = new JLabel("Wybrane kolory:");

        messagePanel.add(messageLabel);

        mainPanel.add(checkBoxPanel, BorderLayout.NORTH);
        mainPanel.add(button, BorderLayout.CENTER);
        mainPanel.add(messagePanel, BorderLayout.SOUTH);

        add(mainPanel, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedColors = new StringBuilder("Wybrane kolory: ");

                if (redCheckBox.isSelected()) {
                    selectedColors.append("Czerwony ");
                    messagePanel.setBackground(Color.RED);
                }
                if (blueCheckBox.isSelected()) {
                    selectedColors.append("Niebieski ");
                    messagePanel.setBackground(Color.BLUE);
                }
                if (yellowCheckBox.isSelected()) {
                    selectedColors.append("Żółty ");
                    messagePanel.setBackground(Color.YELLOW);
                }
                if (yellowCheckBox.isSelected() && blueCheckBox.isSelected()) {
                    selectedColors.append("zieliony");
                    messagePanel.setBackground(Color.GREEN);
                }

                messageLabel.setText(selectedColors.toString());
            }
        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Prog13().setVisible(true);
            }
        });
    }
}