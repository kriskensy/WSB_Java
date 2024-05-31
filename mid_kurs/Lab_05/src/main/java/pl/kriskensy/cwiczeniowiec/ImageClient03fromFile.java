package pl.kriskensy.cwiczeniowiec;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ImageClient03fromFile {

    private JFrame frame;
    private JButton button;
    private JTextField textField;
    private JLabel label;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageClient03fromFile().createAndShowGUI());
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

        textField = new JTextField(20);

        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("File name: "));
        panel.add(textField);
        panel.add(button);

        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void fetchAndDisplayImage() {
        String filename = textField.getText().trim();
        if (filename.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Write file name.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Socket socket = new Socket("localhost", 8080);
             OutputStream out = socket.getOutputStream();
             InputStream in = socket.getInputStream();
             PrintWriter writer = new PrintWriter(out, true)) {

            writer.println(filename);

            BufferedImage image = ImageIO.read(in);
            if (image != null) {
                ImageIcon icon = new ImageIcon(image);
                label.setIcon(icon);
            } else {
                JOptionPane.showMessageDialog(frame, "File download impossible", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
