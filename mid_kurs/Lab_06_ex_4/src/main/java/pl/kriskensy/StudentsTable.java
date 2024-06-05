package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsTable extends JFrame {
    private JPanel mainPanel;
    private JPanel studentsPanel;
    private JPanel listPanel;
    private static JTextArea textArea;
    private JButton dataButton;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField studentIdField;
    private JTextField fieldOfStudyField;

    public StudentsTable() {
        setTitle("Student Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.WHITE);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));

        dataButton = new JButton("Display Students");
        dataButton.setPreferredSize(new Dimension(150, 30));
        dataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayStudents();
            }
        });

        addButton = new JButton("Add Student");
        addButton.setPreferredSize(new Dimension(150, 30));
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        editButton = new JButton("Edit Student");
        editButton.setPreferredSize(new Dimension(150, 30));
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editStudent();
            }
        });

        deleteButton = new JButton("Delete Student");
        deleteButton.setPreferredSize(new Dimension(150, 30));
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });

        listPanel = new JPanel(new BorderLayout());
        listPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        studentsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        studentsPanel.add(new JLabel("Name: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        studentsPanel.add(nameField = new JTextField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        studentsPanel.add(new JLabel("Surname: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        studentsPanel.add(surnameField = new JTextField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        studentsPanel.add(new JLabel("Student Id: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        studentsPanel.add(studentIdField = new JTextField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        studentsPanel.add(new JLabel("Field of study: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        studentsPanel.add(fieldOfStudyField = new JTextField(20), gbc);


        gbc.gridx = 0;
        gbc.gridy = 4;
        studentsPanel.add(dataButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        studentsPanel.add(addButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        studentsPanel.add(editButton, gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        studentsPanel.add(deleteButton, gbc);

        mainPanel.add(listPanel, BorderLayout.CENTER);
        mainPanel.add(studentsPanel, BorderLayout.NORTH);

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

    //ponizsze metody zaimplementuje w zadaniu domowym nr 1
    private void addStudent() {

    }

    private void editStudent() {

    }

    private void deleteStudent() {

    }

    public static void main(String[] args) {
        new StudentsTable();
    }
}
