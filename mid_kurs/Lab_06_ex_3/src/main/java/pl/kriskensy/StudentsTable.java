package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StudentsTable extends JFrame {
    private JPanel mainPanel;
    private static JTextArea textArea;
    private JButton dataButton;

    public StudentsTable() {
        setTitle("Student Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new BorderLayout());
        textArea = new JTextArea();

        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.WHITE);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));

        dataButton = new JButton("Display Students");

        dataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayStudents();
            }
        });

        mainPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        mainPanel.add(dataButton, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    private static void displayStudents() {

        try (Connection connection = Main.getConnection()) {
            String query = "SELECT * FROM students";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            textArea.setText("");

            while (resultSet.next()) {
                int no = resultSet.getInt("No");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String studentID = resultSet.getString("student_id");
                String fieldOfStudy = resultSet.getString("field_of_Study");

                textArea.append("No: " + no + " " + name + " " + surname + ", " + studentID + ", " + fieldOfStudy + "\n");
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new StudentsTable();
    }
}
