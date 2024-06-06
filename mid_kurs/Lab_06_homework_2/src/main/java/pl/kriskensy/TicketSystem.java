package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class TicketSystem extends JFrame {
    private JPanel mainPanel;
    private JPanel servicePanel;
    private JPanel ticketPanel;
    private JComboBox<String> eventComboBox;
    private JTextField clientIDTextField;
    private JTextField clientNameTextField;
    private JButton bookingButton;
    private JTextArea resultArea;

    Connection connection = Main.getConnection();

    public TicketSystem() {
        setTitle("Ticket System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new GridLayout(2, 1));

        servicePanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        servicePanel.add(new JLabel("Select Event: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        eventComboBox = new JComboBox<>();
        showEvents();
        servicePanel.add((eventComboBox), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        servicePanel.add(new JLabel("Client ID: "), gbc);
        clientIDTextField = new JTextField(15);

        gbc.gridx = 1;
        gbc.gridy = 1;
        servicePanel.add(clientIDTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        servicePanel.add(new JLabel("Client Name: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        clientNameTextField = new JTextField(15);
        clientNameTextField.setEditable(false);
        clientNameTextField.setBackground(Color.WHITE);
        servicePanel.add(clientNameTextField, gbc);

        clientIDTextField.addActionListener(new ActionListener() { //po wcisnieciu ENTER, wyswietla imie i nazwisko w polu pod spodem
            public void actionPerformed(ActionEvent e) {
                int clientID = Integer.parseInt(clientIDTextField.getText());
                getClientName(clientID);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 3;
        bookingButton = new JButton("Purchase Ticket");
        bookingButton.setPreferredSize(new Dimension(150, 30));
        bookingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                purchaseTicket();
            }
        });

        servicePanel.add((bookingButton), gbc);

        ticketPanel = new JPanel(new BorderLayout());

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setBackground(Color.WHITE);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 16));

        ticketPanel.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        mainPanel.add(servicePanel);
        mainPanel.add(ticketPanel);

        add(mainPanel);
        setVisible(true);
    }

    private void showEvents() {

        try (Connection connection = Main.getConnection()) {
            String query = "SELECT Name FROM event";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                eventComboBox.addItem(resultSet.getString("name"));
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getClientName(int clientID) {

        try {
            String clientQuery = "SELECT Name, Surname FROM client WHERE No = ?";

            PreparedStatement clientStatement = connection.prepareStatement(clientQuery);
            clientStatement.setInt(1, clientID);
            ResultSet resultSet = clientStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("Name");
                String surname = resultSet.getString("Surname");
                clientNameTextField.setText(name + " " + surname);
            } else {
                clientNameTextField.setText("Client not found");
            }

            resultSet.close();
            clientStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void purchaseTicket() {
        String selectedEvent = (String) eventComboBox.getSelectedItem();
        int clientID = Integer.parseInt(clientIDTextField.getText());

        try {
            String eventQuery = "SELECT * FROM event WHERE Name = ?";
            PreparedStatement eventStatement = connection.prepareStatement(eventQuery);
            eventStatement.setString(1, selectedEvent);
            ResultSet resultSet = eventStatement.executeQuery();

            if (resultSet.next()) {
                int minAge = resultSet.getInt("min_age");
                double ticketPrice = resultSet.getDouble("ticket_price");
                String showFor = resultSet.getString("show_for");

                String clientQuery = "SELECT * FROM client WHERE No = ?";
                PreparedStatement clientStatement = connection.prepareStatement(clientQuery);
                clientStatement.setInt(1, clientID);
                ResultSet resultSet1 = clientStatement.executeQuery();

                if (resultSet1.next()) {
                    int age = resultSet1.getInt("age");
                    double accountBalance = resultSet1.getDouble("account_balance");
                    String otherCriteria = resultSet1.getString("other_criteria");

                    if (age < minAge) {
                        resultArea.setText("Client is too young for this show.");
                    } else if (accountBalance < ticketPrice) {
                        resultArea.setText("Client does not have enough money.");
                    } else if (!showFor.contains(otherCriteria)) {
                        resultArea.setText("Client must be a " + showFor + " to purchase the ticket.");
                    } else {
                        accountBalance -= ticketPrice;
                        String updateQuery = "UPDATE client SET account_balance = ? WHERE No = ?";
                        PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                        updateStatement.setDouble(1, accountBalance);
                        updateStatement.setInt(2, clientID);
                        updateStatement.executeUpdate();

                        resultArea.setText("Ticket for: " + clientNameTextField.getText() + " purchased successfully!");
                    }
                } else {
                    resultArea.setText("Client not found.");
                }

                resultSet1.close();
                clientStatement.close();
            }

            resultSet.close();
            eventStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TicketSystem();
    }
}