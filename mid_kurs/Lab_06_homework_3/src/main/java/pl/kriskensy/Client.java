package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class Client extends JFrame {
    private JPanel mainPanel;
    private JPanel servicePanel;
    private JPanel displayPanel;
    private JTextField producerField;
    private JTextField productNameField;
    private JTextField productQuantityField;
    private JTextField productPriceField;
    private JTextField modifyProductIDField;
    private JTextField modifyProductQuantityField;
    private JTextField problemDescriptionField;
    private JButton addButton;
    private JButton modifyButton;
    private JButton checkConnectionButton;
    private JButton reportProblemButton;
    private JTextArea resultArea;
    private Socket socket;
    private PrintWriter output;
    private BufferedReader input;

    private static String HOSTNAME = "localhost";
    private static int PORT = 12345;

    public Client() {
        setTitle("Fieldhockeysticks Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);

        try {
            socket = new Socket(HOSTNAME, PORT);
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            resultArea.setText("Connecting to server failed: " + e.getMessage());
            e.printStackTrace();
        }

        mainPanel = new JPanel(new GridLayout(2, 1));
        displayPanel = new JPanel(new BorderLayout());

        servicePanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        servicePanel.add(new JLabel("Producer: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        producerField = new JTextField(20);
        servicePanel.add((producerField), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        servicePanel.add(new JLabel("Product Name:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        productNameField = new JTextField(20);
        servicePanel.add((productNameField), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        servicePanel.add(new JLabel("Product Quantity:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        productQuantityField = new JTextField(20);
        servicePanel.add((productQuantityField), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        servicePanel.add(new JLabel("Product Price:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        productPriceField = new JTextField(20);
        servicePanel.add((productPriceField), gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        servicePanel.add(new JLabel("Modify Product ID:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        modifyProductIDField = new JTextField(20);
        servicePanel.add((modifyProductIDField), gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        servicePanel.add(new JLabel("New Quantity:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        modifyProductQuantityField = new JTextField(20);
        servicePanel.add((modifyProductQuantityField), gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        servicePanel.add(new JLabel("Problem Description:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        problemDescriptionField = new JTextField(20);
        servicePanel.add((problemDescriptionField), gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        checkConnectionButton = new JButton("Check Connection");
        checkConnectionButton.setPreferredSize(new Dimension(150, 30));
        checkConnectionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkConnection();
            }
        });
        servicePanel.add((checkConnectionButton), gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        addButton = new JButton("Add Product");
        addButton.setPreferredSize(new Dimension(150, 30));
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });
        servicePanel.add((addButton), gbc);

        gbc.gridx = 2;
        gbc.gridy = 7;
        modifyButton = new JButton("Modify Product");
        modifyButton.setPreferredSize(new Dimension(150, 30));
        modifyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                modifyProductsQuantity();
            }
        });
        servicePanel.add((modifyButton), gbc);

        gbc.gridx = 3;
        gbc.gridy = 7;
        reportProblemButton = new JButton("Report Problem");
        reportProblemButton.setPreferredSize(new Dimension(150, 30));
        reportProblemButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reportProblem();
            }
        });
        servicePanel.add((reportProblemButton), gbc);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setBackground(Color.WHITE);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 16));

        displayPanel.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        mainPanel.add(servicePanel);
        mainPanel.add(displayPanel);

        add(mainPanel);
        setVisible(true);
    }

    private void checkConnection() {
        output.println("CHECK_CONNECTION");
        try {
            String response = input.readLine();
            resultArea.setText(response);
        } catch (IOException e) {
            e.printStackTrace();
            resultArea.setText("Error: " + e.getMessage());
        }
    }

    private void addProduct() {
        String producer = producerField.getText();
        String name = productNameField.getText();
        int quantity;
        double price;

        try {
            quantity = Integer.parseInt(productQuantityField.getText());
            price = Double.parseDouble(productPriceField.getText());
        } catch (NumberFormatException e) {
            resultArea.setText("Error: Quantity and Price must be numeric values.");
            return;
        }

        if (producer.isEmpty() || name.isEmpty() || quantity < 0 || price < 0) {
            resultArea.setText("Error: Producer or Name or Product Quantity or Price are incorrect");
        } else {
            output.println("ADD_PRODUCT," + producer + "," + name + "," + quantity + "," + price);
            try {
                String response = input.readLine().replaceAll(",", "\n");
                resultArea.setText(response);
            } catch (IOException e) {
                e.printStackTrace();
                resultArea.setText("Error: " + e.getMessage());
            }
        }
    }

    private void modifyProductsQuantity() {
        int id;
        int quantity;

        try {
            id = Integer.parseInt(modifyProductIDField.getText());
            quantity = Integer.parseInt(modifyProductQuantityField.getText());
        } catch (NumberFormatException e) {
            resultArea.setText("Error: Quantity and Product ID must be numeric values.");
            return;
        }

        if (id < 1 || quantity < 0) {
            resultArea.setText("Error: Product ID and Quantity are incorrect.");
        } else {
            output.println("MODIFY_QUANTITY," + id + "," + quantity);
            try {
                String response = input.readLine().replaceAll(",", "\n");
                resultArea.setText(response);
            } catch (IOException e) {
                e.printStackTrace();
                resultArea.setText("Error: " + e.getMessage());
            }
        }
    }

    private void reportProblem() {
        String problem = problemDescriptionField.getText();

        if (!problem.isEmpty()) {
            output.println("REPORT_PROBLEM," + problem);
            try {
                String response = input.readLine();
                resultArea.setText(response);
            } catch (IOException e) {
                e.printStackTrace();
                resultArea.setText("Error: " + e.getMessage());
            }
        } else {
            resultArea.setText("Please describe a problem");
        }
    }

    public static void main(String[] args) {
        new Client();
    }
}
