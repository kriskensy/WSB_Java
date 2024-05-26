package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZadDom2 extends JFrame {
    private JPanel mainPanel;
    private JPanel checkboxPanel;
    private JPanel controlPanel;

    public ZadDom2() {
        setTitle("Kalkulator biznesowy");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        mainPanel = new JPanel();
        checkboxPanel = new JPanel();
        controlPanel = new JPanel();

        controlPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(4, 4, 4, 4);

        JLabel tekstStawkiVAT = new JLabel("stawki VAT:");
        tekstStawkiVAT.setFont(new Font("Serif", Font.PLAIN, 20));

        JRadioButton radioButton0 = new JRadioButton("0%");
        JRadioButton radioButton5 = new JRadioButton("5%");
        JRadioButton radioButton8 = new JRadioButton("8%");
        JRadioButton radioButton23 = new JRadioButton("23%");

        checkboxPanel.add(tekstStawkiVAT);
        checkboxPanel.add(radioButton0);
        checkboxPanel.add(radioButton5);
        checkboxPanel.add(radioButton8);
        checkboxPanel.add(radioButton23);

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton0);
        radioButtonGroup.add(radioButton5);
        radioButtonGroup.add(radioButton8);
        radioButtonGroup.add(radioButton23);

        JButton buttonObliczNetto = new JButton("OBLICZ");
        buttonObliczNetto.setForeground(Color.RED);
        JButton buttonObliczBrutto = new JButton("OBLICZ");
        buttonObliczBrutto.setForeground(Color.BLUE);

        JTextArea poleWprowadzWartoscNetto = new JTextArea();
        poleWprowadzWartoscNetto.setColumns(8);
        poleWprowadzWartoscNetto.setFont(new Font("Serif", Font.PLAIN, 20));

        JTextArea poleWprowadzWartoscBrutto = new JTextArea();
        poleWprowadzWartoscBrutto.setColumns(8);
        poleWprowadzWartoscBrutto.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel wartoscPodatku = new JLabel("");
        wartoscPodatku.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel tekstWartoscNetto = new JLabel("Wartosc netto:");
        tekstWartoscNetto.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel tekstWartoscBrutto = new JLabel("Wartosc brutto:");
        tekstWartoscBrutto.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel tekstWartoscPodatku = new JLabel("Wartosc podatku:");
        tekstWartoscPodatku.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel tekstWaluta = new JLabel("€");
        tekstWaluta.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel tekstWaluta2 = new JLabel("€");
        tekstWaluta2.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel tekstWaluta3 = new JLabel("€");
        tekstWaluta3.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel tekstWyliczonaWartosc = new JLabel("0");
        tekstWyliczonaWartosc.setFont(new Font("Serif", Font.PLAIN, 20));

        gbc.gridx = 0;
        gbc.gridy = 1;
        controlPanel.add(tekstWartoscNetto, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        controlPanel.add(poleWprowadzWartoscNetto, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        controlPanel.add(tekstWaluta, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        controlPanel.add(buttonObliczNetto, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        controlPanel.add(tekstWartoscPodatku, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        controlPanel.add(tekstWyliczonaWartosc, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        controlPanel.add(tekstWaluta2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        controlPanel.add(tekstWartoscBrutto, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        controlPanel.add(poleWprowadzWartoscBrutto, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        controlPanel.add(tekstWaluta3, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        controlPanel.add(buttonObliczBrutto, gbc);

        mainPanel.add(checkboxPanel, BorderLayout.NORTH);
        mainPanel.add(controlPanel, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);

        buttonObliczNetto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double calculationResult = 0;
                double enteredNumber = Double.parseDouble(poleWprowadzWartoscNetto.getText());
                if (radioButton0.isSelected()) {
                    calculationResult = 0;
                } else if (radioButton5.isSelected()) {
                    calculationResult = enteredNumber * 0.05;
                } else if (radioButton8.isSelected()) {
                    calculationResult = enteredNumber * 0.08;
                } else if (radioButton23.isSelected()) {
                    calculationResult = enteredNumber * 0.23;
                }

                String resultText = String.valueOf(calculationResult);
                tekstWyliczonaWartosc.setText(resultText);
            }
        });

        buttonObliczBrutto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double calculationResult = 0;
                double enteredNumber = Double.parseDouble(poleWprowadzWartoscBrutto.getText());
                if (radioButton0.isSelected()) {
                    calculationResult = 0;
                } else if (radioButton5.isSelected()) {
                    calculationResult = enteredNumber - (enteredNumber / 1.05);
                } else if (radioButton8.isSelected()) {
                    calculationResult = enteredNumber - (enteredNumber / 1.08);
                } else if (radioButton23.isSelected()) {
                    calculationResult = enteredNumber - (enteredNumber / 1.23);
                }

                String resultText = String.valueOf(calculationResult);
                tekstWyliczonaWartosc.setText(resultText);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ZadDom2().setVisible(true);
            }
        });
    }
}