package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad1 extends JFrame {
    private JPanel mainPanel;
    private JPanel drawingPanel;
    private JButton closeButton;
    private JButton buttonDrawing;
    private JComboBox<String> comBox;

    public Zad1() {
        setTitle("Shapes");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
        addComponentsToFrame();
    }

    private void initComponents() {
        mainPanel = new JPanel(new BorderLayout());
        drawingPanel = new JPanel() {
        };

        String[] options = {"Square", "Rectangle", "Circle", "Rounded Rectangle"};
        comBox = new JComboBox<>(options);

        buttonDrawing = new JButton("Draw this shape!");

        buttonDrawing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedShape = (String) comBox.getSelectedItem();
                clearDrawingPanel(getGraphics());

                switch (selectedShape) {
                    case "Square":
                        getGraphics().drawRect(200, 200, 100, 100);
                        break;
                    case "Rectangle":
                        getGraphics().drawRect(150, 200, 200, 100);
                        break;
                    case "Circle":
                        getGraphics().drawOval(200, 200, 100, 100);
                        break;
                    case "Rounded Rectangle":
                        getGraphics().drawRoundRect(200, 200, 100, 100, 30, 30);
                        break;
                }
            }
        });

        drawingPanel.add(comBox);
        drawingPanel.add(buttonDrawing);

        closeButton = new JButton("close");
        closeButton.addActionListener(e -> dispose());

        mainPanel.add(drawingPanel, BorderLayout.CENTER);
        mainPanel.add(closeButton, BorderLayout.SOUTH);
    }

    private void clearDrawingPanel(Graphics g) {
        g.clearRect(100, 100, 350, 350);
    }

    private void addComponentsToFrame() {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Zad1().setVisible(true);
            }
        });
    }
}