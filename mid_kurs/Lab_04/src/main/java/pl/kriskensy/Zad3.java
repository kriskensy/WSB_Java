package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Zad3 extends JFrame {
    private JPanel mainPanel;
    private JPanel chatPanel;
    private JPanel controlPanel;
    private JTextArea textArea;
    private JButton sendButton;
    private JButton exitButton;
    private JButton fileChoiceButton;
    private JButton saveButton;
    private JTextField fileTextField;

    String fileName;

    public Zad3() {
        setTitle("Text to file");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new BorderLayout());
        chatPanel = new JPanel(new BorderLayout());
        controlPanel = new JPanel(new FlowLayout());

        textArea = new JTextArea();
        textArea.setEditable(true);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.WHITE);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        textArea.setMargin(new Insets(10, 10, 10, 10));

        fileTextField = new JTextField();
        fileTextField.setEditable(true);
        fileTextField.setColumns(30);
        fileTextField.setBackground(Color.WHITE);
        fileTextField.setFont(new Font("Monospaced", Font.PLAIN, 16));

        fileChoiceButton = new JButton("File choice");

        fileChoiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChoice();
            }
        });

        sendButton = new JButton("Send");

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        saveButton = new JButton("Save");

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveMessage();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        chatPanel.add(textArea, BorderLayout.CENTER);
        controlPanel.add(fileTextField);
        controlPanel.add(fileChoiceButton);
        controlPanel.add(sendButton);
        controlPanel.add(saveButton);
        controlPanel.add(exitButton);

        mainPanel.add(chatPanel, BorderLayout.CENTER);
        mainPanel.add(controlPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    private void fileChoice() {

        if (((fileTextField.getText().isEmpty()) == false)) {
            fileName = fileTextField.getText();
        } else {
            textArea.setText("File doesn't exists, choose another one!\n");
        }
    }

    private void sendMessage() {

        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                textArea.append(line + "\n");
            }
            bufferedReader.close();

        } catch (IOException e) {
            textArea.setText("Error!\n");
        }
    }

    private void saveMessage() throws IOException {
        String textToSave = textArea.getText();

        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(textToSave);
        fileWriter.close();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Zad3().setVisible(true);
            }
        });
    }
}