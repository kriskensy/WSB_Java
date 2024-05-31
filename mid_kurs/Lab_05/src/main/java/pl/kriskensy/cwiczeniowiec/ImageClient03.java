package pl.kriskensy.cwiczeniowiec;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageClient03 {
    private JFrame frame;
    private JButton button;
    private JLabel label;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageClient03().createAndShowGUI());
    }

    private void createAndShowGUI() {
        frame = new JFrame("Image Client");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        button = new JButton("Download image");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fetchAndDisplayImage();
            }
        });

        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        frame.getContentPane().add(button, BorderLayout.SOUTH);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void fetchAndDisplayImage() {

        try (Socket socket = new Socket("localhost", 8080);
             InputStream in = socket.getInputStream()) {

            BufferedImage image = ImageIO.read(in);
            if (image != null) {
                ImageIcon icon = new ImageIcon(image);
                label.setIcon(icon);
            } else {
                JOptionPane.showMessageDialog(frame, "Image download impossible!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}