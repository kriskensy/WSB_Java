package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ZadDom1 extends JFrame {
    private JTextArea textArea;
    private JTextField textField;
    private JButton sendButton;
    private JButton exitButton;
    private JPanel mainPanel;

    public ZadDom1() {
        setTitle("Chat");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new BorderLayout());
        JPanel chatPanel = new JPanel(new BorderLayout());
        JPanel controlPanel = new JPanel(new FlowLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.WHITE);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        textArea.setMargin(new Insets(10, 10, 10, 10));

        textField = new JTextField();
        textField.setEditable(true);
        textField.setBackground(Color.WHITE);
        textField.setFont(new Font("Monospaced", Font.PLAIN, 16));

        sendButton = new JButton("Send");

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        exitButton = new JButton("Cancel");

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sendMessage();
                }
            }
        });

        chatPanel.add(textArea, BorderLayout.CENTER);
        chatPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        controlPanel.add(textField);
        textField.setColumns(40);
        controlPanel.add(sendButton);
        controlPanel.add(exitButton);

        mainPanel.add(chatPanel, BorderLayout.CENTER);
        mainPanel.add(controlPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    private void sendMessage() {
        if ((textField.getText().isEmpty()) == false) {
            String message = textField.getText();
            textArea.append(message + "\n");
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ZadDom1().setVisible(true);
            }
        });
    }
}