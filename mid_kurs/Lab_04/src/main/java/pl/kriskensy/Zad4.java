package pl.kriskensy;

import javax.swing.*;
import java.awt.*;

public class Zad4 extends JFrame {
    private JPanel mainPanel;
    private JPanel headerPanel;
    private JPanel mousePositionsPanel;
    private JLabel mouseLabelX;
    private JLabel mouseLabelY;
    private JTextArea mousePositionX;
    private JTextArea mousePositionY;
    private JScrollPane scrollPaneX;
    private JScrollPane scrollPaneY;

    public Zad4() {
        setTitle("Mouse position");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new BorderLayout());
        headerPanel = new JPanel(new GridLayout());
        mousePositionsPanel = new JPanel(new GridLayout());

        mouseLabelX = new JLabel("Position X");
        mouseLabelY = new JLabel("Position Y");

        mousePositionX = new JTextArea();
        mousePositionX.setEditable(false);
        mousePositionX.setBackground(Color.WHITE);
        mousePositionX.setFont(new Font("Arial", Font.PLAIN, 16));

        mousePositionY = new JTextArea();
        mousePositionY.setEditable(false);
        mousePositionY.setBackground(Color.WHITE);
        mousePositionY.setFont(new Font("Arial", Font.PLAIN, 16));

        scrollPaneX = new JScrollPane(mousePositionX);
        scrollPaneY = new JScrollPane(mousePositionY);

        headerPanel.add(mouseLabelX);
        headerPanel.add(mouseLabelY);

        mousePositionsPanel.add(scrollPaneX);
        mousePositionsPanel.add(scrollPaneY);

        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(mousePositionsPanel, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);

        Thread mouseThread = new Thread(() -> {
            try {
                while (true) {
                    PointerInfo pointerInfo = MouseInfo.getPointerInfo();
                    Point point = pointerInfo.getLocation();
                    int mouseX = point.x, mouseY = point.y;
                    mousePositionX.append("Mouse X: " + mouseX + "\n");
                    mousePositionY.append("Mouse Y: " + mouseY + "\n");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            } finally {
                System.out.println("mouse is sleeping now :)");
            }
        });

        mouseThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Zad4().setVisible(true);
            }
        });
    }
}