package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZadDom3 extends JFrame {
    private JPanel mainPanel;
    private JPanel headerPanel;
    private JPanel personsPanel;
    private JPanel choicePanel;
    private JPanel footerPanel;

    public ZadDom3() {
        setTitle("Zad Dom3");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new BorderLayout());
        headerPanel = new JPanel(new GridLayout(1, 3));
        personsPanel = new JPanel(new BorderLayout());
        choicePanel = new JPanel(new GridLayout(5, 1));
        footerPanel = new JPanel(new BorderLayout());

        JButton buttonAboutAuthor = new JButton("About author");
        JButton buttonAddPerson = new JButton("Add");
        JButton buttonDeletePerson = new JButton("Delete");

        headerPanel.add(buttonAboutAuthor);
        headerPanel.add(buttonAddPerson);
        headerPanel.add(buttonDeletePerson);

        JRadioButton radioButtonFirstName = new JRadioButton("only first name");
        JRadioButton radioButtonLastName = new JRadioButton("only last name");
        JRadioButton radioButtonName = new JRadioButton("first name and last name");

        choicePanel.add(radioButtonFirstName);
        choicePanel.add(radioButtonLastName);
        choicePanel.add(radioButtonName);

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButtonFirstName);
        radioButtonGroup.add(radioButtonLastName);
        radioButtonGroup.add(radioButtonName);

        DefaultListModel<String> personListModel = new DefaultListModel<>();
        personListModel.addElement("Jan Bednarek");
        personListModel.addElement("Zosia Nowak");
        personListModel.addElement("Michael Jordan");
        personListModel.addElement("Robert Lewandowski");
        personListModel.addElement("Ignacy Paderewski");
        personListModel.addElement("Grzegorz Brzeczyszczykiewicz");

        JList<String> personsList = new JList<>(personListModel);
        personsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        personsPanel.add(personsList);

        JLabel displayInformationLabel = new JLabel("Information");
        displayInformationLabel.setForeground(Color.WHITE);
        displayInformationLabel.setFont(new Font("Arial", Font.PLAIN, 28));
        footerPanel.setBackground(Color.BLACK);
        footerPanel.add(displayInformationLabel, BorderLayout.WEST);

        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(personsPanel, BorderLayout.CENTER);
        mainPanel.add(choicePanel, BorderLayout.EAST);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);

        add(mainPanel, BorderLayout.CENTER);

        buttonAboutAuthor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayInformationLabel.setText("Krzysztof Kensy");
            }
        });

        radioButtonFirstName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedPerson = personsList.getSelectedValue();
                String[] names = selectedPerson.split(" ");
                String firstName = names[0];
                String lastName = names[1];
                displayInformationLabel.setText(firstName);
            }
        });

        radioButtonLastName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedPerson = personsList.getSelectedValue();
                String[] names = selectedPerson.split(" ");
                String firstName = names[0];
                String lastName = names[1];
                displayInformationLabel.setText(lastName);
            }
        });

        radioButtonName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedPerson = personsList.getSelectedValue();
                displayInformationLabel.setText(selectedPerson);
            }
        });

        buttonDeletePerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personListModel.removeElement(personsList.getSelectedValue());
                //System.out.println(personsList.getSelectedValue() + " removed!");
            }
        });

        buttonAddPerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWindowNewFirstName();
            }
        });
    }

    private void openWindowNewFirstName() {
        JFrame inputFrameFirstName = new JFrame("Input first name");
        inputFrameFirstName.setSize(500, 200);
        setLayout(new BorderLayout());

        JPanel addPersonFirstNamePanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(4, 4, 4, 4);

        JButton buttonFirstNameOK = new JButton("OK");
        JButton buttonFirstNameCancel = new JButton("Cancel");
        JLabel labelAddNewPersonFirstName = new JLabel("What is the first name of a new person?");
        JTextField textFieldFirstName = new JTextField();

        gbc.gridx = 0;
        gbc.gridy = 0;
        addPersonFirstNamePanel.add(labelAddNewPersonFirstName, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        addPersonFirstNamePanel.add(textFieldFirstName, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        addPersonFirstNamePanel.add(buttonFirstNameOK, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        addPersonFirstNamePanel.add(buttonFirstNameCancel, gbc);

        inputFrameFirstName.add(addPersonFirstNamePanel, BorderLayout.CENTER);
        inputFrameFirstName.setVisible(true);

        buttonFirstNameCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputFrameFirstName.dispose();
            }
        });

        final String[] newPersonFullyName = new String[1];
        final String[] firstName = new String[1];
        final String[] lastName = new String[1];

        buttonFirstNameOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstName[0] = textFieldFirstName.getText();
                inputFrameFirstName.dispose();
                openWindowNewLastName();
                System.out.println(firstName[0]);
            }

            private void openWindowNewLastName() {
                JFrame inputFrameLastName = new JFrame("Input last name");
                inputFrameLastName.setSize(500, 200);
                setLayout(new BorderLayout());

                JPanel addPersonLastNamePanel = new JPanel(new GridBagLayout());

                GridBagConstraints gbc = new GridBagConstraints();
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets = new Insets(4, 4, 4, 4);

                JButton buttonLastNameOK = new JButton("OK");
                JButton buttonLastNameCancel = new JButton("Cancel");
                JLabel labelAddNewPersonLastName = new JLabel("What is the last name of a new person?");
                JTextField textFieldLastName = new JTextField();

                gbc.gridx = 0;
                gbc.gridy = 0;
                addPersonLastNamePanel.add(labelAddNewPersonLastName, gbc);
                gbc.gridx = 0;
                gbc.gridy = 1;
                addPersonLastNamePanel.add(textFieldLastName, gbc);
                gbc.gridx = 0;
                gbc.gridy = 2;
                addPersonLastNamePanel.add(buttonLastNameOK, gbc);
                gbc.gridx = 0;
                gbc.gridy = 3;
                addPersonLastNamePanel.add(buttonLastNameCancel, gbc);

                inputFrameLastName.add(addPersonLastNamePanel, BorderLayout.CENTER);
                inputFrameLastName.setVisible(true);

                buttonLastNameCancel.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        inputFrameLastName.dispose();
                    }
                });

                buttonLastNameOK.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        lastName[0] = textFieldLastName.getText();
                        newPersonFullyName[0] = firstName[0] + " " + lastName[0];
                        System.out.println(newPersonFullyName[0]);
                        inputFrameLastName.dispose();
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ZadDom3().setVisible(true);
            }
        });
    }
}