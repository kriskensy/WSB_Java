package pl.kriskensy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DrawingApp extends JFrame {
    private JPanel drawingPanel;
    private JPanel controlPanel;
    private Color backgroundColor = Color.WHITE;
    private Color brushColor = Color.BLACK;
    private boolean isDrawing = false;
    private int prevX, prevY;
    private JButton backgroundColorButton;
    private JButton brushColorButton;
    private JButton saveButton;
    private BufferedWriter eventLogger;

    private boolean backgroundColorButtonActive = false;
    private boolean brushColorButtonActive = false;
    private boolean saveButtonActive = false;

    public DrawingApp() {
        setTitle("Drawing App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        setupUI();
        eventLogging();
        setVisible(true);
    }

    private void setupUI() {

        controlPanel = new JPanel();
        drawingPanel = new JPanel() {

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(backgroundColor);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        drawingPanel.setBackground(backgroundColor);

        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    isDrawing = true;
                    prevX = e.getX();
                    prevY = e.getY();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    isDrawing = false;
                }
            }
        });

        drawingPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (isDrawing) {
                    Graphics g = drawingPanel.getGraphics();
                    g.setColor(brushColor);
                    g.drawLine(prevX, prevY, e.getX(), e.getY());
                    prevX = e.getX();
                    prevY = e.getY();
                    g.dispose();
                }
            }
        });

        backgroundColorButton = new JButton("Background Color");
        backgroundColorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backgroundColorButtonActive = true;
                backgroundColor = JColorChooser.showDialog(backgroundColorButton, "Choose background color", backgroundColor);
                drawingPanel.setBackground(backgroundColor);
                drawingPanel.repaint();
            }
        });

        brushColorButton = new JButton("Brush Color");
        brushColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                brushColorButtonActive = true;
                brushColor = JColorChooser.showDialog(brushColorButton, "Choose brush color", brushColor);
            }
        });

        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveButtonActive = true;
                saveImage();
            }
        });

        controlPanel.add(backgroundColorButton);
        controlPanel.add(brushColorButton);
        controlPanel.add(saveButton);

        add(drawingPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

    private void saveImage() {
        BufferedImage bufferedImage = new BufferedImage(drawingPanel.getWidth(), drawingPanel.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D imageGraphics = bufferedImage.createGraphics();
        drawingPanel.paint(imageGraphics);
        imageGraphics.dispose();

        try { //todo cos mi to zapisywanie obrazka nie dziala, samo tlo sie zapisuje...
            String filename = "file.jpg";
            File file = new File(filename);
            ImageIO.write(bufferedImage, "jpg", file);
            JOptionPane.showMessageDialog(controlPanel, "Image saved");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(controlPanel, "Failed to save image");
        }
    }

    private void eventLogging() {
        try {
            eventLogger = new BufferedWriter(new FileWriter("file.txt"));
            Thread eventLoggingThread = new Thread(() -> {
                eventMonitoring();
            });
            eventLoggingThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void eventMonitoring() {
        try {
            while (true) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String operationsTime = sdf.format(new Date());

                if (isDrawing) {
                    eventLogger.write(operationsTime + " -> drawing Picasso\n");
                    eventLogger.flush();
                } else if (backgroundColorButtonActive) {
                    eventLogger.write(operationsTime + " -> Background color button pressed\n");
                    eventLogger.flush();
                    backgroundColorButtonActive = false;

                } else if (brushColorButtonActive) {
                    eventLogger.write(operationsTime + " -> Brush color button pressed\n");
                    eventLogger.flush();
                    brushColorButtonActive = false;

                } else if (saveButtonActive) {
                    eventLogger.write(operationsTime + " -> Save button pressed\n");
                    eventLogger.flush();
                    saveButtonActive = false;

                } else {
                    eventLogger.write(operationsTime + " -> chill\n");
                    eventLogger.flush();
                }

                Thread.sleep(100);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}