package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Zad2 extends JFrame {
    private JPanel mainPanel;
    private JPanel drawingPanel;
    private JButton closeButton;
    private JButton buttonDrawing;
    private JComboBox<String> comBox;
    private JFrame xVerticesShapeFrame;
    private JPanel xShapeMainPanel;
    private JPanel xShapeCoordinatesPanel;
    private JButton okButton;
    private JButton cancelButton;
    private JTextField verticesTextField;
    private ArrayList<JTextField> xTextFields;
    private ArrayList<JTextField> yTextFields;

    public Zad2() {
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
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawPoints(g);
            }
        };

        String[] options = {"Square", "Rectangle", "Circle", "Rounded rectangle", "X vertices shape"};
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
                    case "X vertices shape":
                        drawAnyShape();
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
        g.clearRect(0, 50, 500, 450);
    }

    private void drawAnyShape() {
        xVerticesShapeFrame = new JFrame("X vertices shape");
        xVerticesShapeFrame.setSize(500, 500);
        xVerticesShapeFrame.setLocationRelativeTo(null);
        xVerticesShapeFrame.setLayout(new BorderLayout());

        xShapeMainPanel = new JPanel(new GridLayout(3, 2));
        xShapeCoordinatesPanel = new JPanel(new GridLayout(0, 2));

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");

        JLabel verticesLabel = new JLabel("Vertices number: ");
        JLabel coordinateX = new JLabel("Coordinate X");
        JLabel coordinateY = new JLabel("Coordinate Y");

        verticesTextField = new JTextField();
        xTextFields = new ArrayList<>();
        yTextFields = new ArrayList<>();

        verticesTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int verticesNumber = Integer.parseInt(verticesTextField.getText());

                    xShapeCoordinatesPanel.removeAll();
                    xTextFields.clear();
                    yTextFields.clear();

                    for (int i = 1; i <= verticesNumber; i++) {
                        JTextField xCoordinate = new JTextField();
                        JTextField yCoordinate = new JTextField();
                        xTextFields.add(xCoordinate);
                        yTextFields.add(yCoordinate);
                        xShapeCoordinatesPanel.add(xCoordinate);
                        xShapeCoordinatesPanel.add(yCoordinate);
                    }
                    xShapeCoordinatesPanel.revalidate();
                    xShapeCoordinatesPanel.repaint();
                }
            }
        });

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();
                int verticesNumber = xTextFields.size();
                int[] xPoints = new int[verticesNumber];
                int[] yPoints = new int[verticesNumber];

                for (int i = 0; i < verticesNumber; i++) {
                    xPoints[i] = Integer.parseInt(xTextFields.get(i).getText());
                    yPoints[i] = Integer.parseInt(yTextFields.get(i).getText());
                }

                g.drawPolygon(xPoints, yPoints, verticesNumber);
                xVerticesShapeFrame.dispose();
            }
        });

        xShapeMainPanel.add(verticesLabel);
        xShapeMainPanel.add(verticesTextField);
        xShapeMainPanel.add(coordinateX);
        xShapeMainPanel.add(coordinateY);

        xShapeMainPanel.add(okButton);
        xShapeMainPanel.add(cancelButton);

        xVerticesShapeFrame.add(xShapeMainPanel, BorderLayout.NORTH);
        xVerticesShapeFrame.add(xShapeCoordinatesPanel, BorderLayout.CENTER);
        xVerticesShapeFrame.setVisible(true);

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                xVerticesShapeFrame.dispose();
            }
        });
    }

    private void addComponentsToFrame() {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(mainPanel, BorderLayout.CENTER);
    }

    private void drawPoints(Graphics g) {
        g.setColor(Color.black);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Zad2().setVisible(true);
            }
        });
    }
}