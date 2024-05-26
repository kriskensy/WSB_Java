//Zad 2 Napisz aplikacje okienkowa swing(mozna uzywac kreatora layoutów) w której wykorzystasz osobne watki do renderowania
//3 pol którym bedzie mozna za pomoca suwaków i przycisku statycznie nadawal kolor wykorzystujac notacje hexdecymalna RGB
//todo maja byc 3 pola i 3 suwaki
package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad2 extends JFrame {
    private JPanel mainPanel;
    private JPanel colorPanelsHolder;
    private JPanel colorPanel1;
    private JPanel colorPanel2;
    private JPanel colorPanel3;
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;
    private JButton updateButton;
    private JLabel colorLabel;

    public Zad2() {
        setTitle("Colors");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new GridLayout(5, 1));
        colorPanel1 = new JPanel();
        colorPanel2 = new JPanel();
        colorPanel3 = new JPanel();

        colorPanelsHolder = new JPanel(new GridLayout(1, 3));
        colorPanelsHolder.add(colorPanel1);
        colorPanelsHolder.add(colorPanel2);
        colorPanelsHolder.add(colorPanel3);

        redSlider = new JSlider(0, 255, 0);
        greenSlider = new JSlider(0, 255, 0);
        blueSlider = new JSlider(0, 255, 0);

        colorLabel = new JLabel("#000000");

        updateButton = new JButton("Update Color");

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateColor();
            }
        });

        mainPanel.add(redSlider);
        mainPanel.add(new JLabel("red"));
        mainPanel.add(greenSlider);
        mainPanel.add(new JLabel("green"));
        mainPanel.add(blueSlider);
        mainPanel.add(new JLabel("blue"));

        mainPanel.add(updateButton);
        mainPanel.add(colorLabel);

        add(colorPanelsHolder, BorderLayout.CENTER);
        add(mainPanel, BorderLayout.NORTH);
        setVisible(true);
    }

    private void updateColor() {
        int red = redSlider.getValue();
        int green = greenSlider.getValue();
        int blue = blueSlider.getValue();

        String colorCode = String.format("#%02X%02X%02X", red, green, blue);
        colorLabel.setText(colorCode);

        Color colorRed = new Color(red, 0, 0);
        Color colorGreen = new Color(0, green, 0);
        Color colorBlue = new Color(0, 0, blue);

        Thread redColorThread = new Thread(() -> {
            colorPanel1.setBackground(colorRed);
        });
        redColorThread.start();

        Thread greenColorThread = new Thread(() -> {
            colorPanel2.setBackground(colorGreen);
        });
        greenColorThread.start();

        Thread blueColorThread = new Thread(() -> {
            colorPanel3.setBackground(colorBlue);
        });
        blueColorThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Zad2().setVisible(true);
            }
        });
    }
}