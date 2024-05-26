package pl.kriskensy;

import javax.swing.*;
import java.awt.*;

public class ZadDom1 extends JFrame {
    private JPanel mainPanel;
    private JPanel clockPanel;
    private JPanel calculatorPanel;
    private JLabel clockLabel;
    private JLabel operandLabel1;
    private JLabel operandLabel2;
    private JLabel resultWritingLabel;
    private JLabel resultLabel;
    private JTextField operandTextField1;
    private JTextField operandTextField2;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;


    public ZadDom1() {
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 180);

        mainPanel = new JPanel(new BorderLayout());
        clockPanel = new JPanel(new FlowLayout());
        calculatorPanel = new JPanel(new GridLayout(3, 3));

        clockLabel = new JLabel("00:00:00");
        clockLabel.setFont(new Font("Serif", Font.PLAIN, 20));

        operandLabel1 = new JLabel("Operand 1:");
        operandLabel1.setFont(new Font("Serif", Font.PLAIN, 20));

        operandLabel2 = new JLabel("Operand 2:");
        operandLabel2.setFont(new Font("Serif", Font.PLAIN, 20));

        resultWritingLabel = new JLabel("Result:");
        resultWritingLabel.setFont(new Font("Serif", Font.PLAIN, 20));

        resultLabel = new JLabel("???");
        resultLabel.setFont(new Font("Serif", Font.PLAIN, 20));

        operandTextField1 = new JTextField();
        operandTextField1.setColumns(8);
        operandTextField1.setFont(new Font("Serif", Font.PLAIN, 20));

        operandTextField2 = new JTextField();
        operandTextField2.setColumns(8);
        operandTextField2.setFont(new Font("Serif", Font.PLAIN, 20));

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");

        clockPanel.add(clockLabel);

        calculatorPanel.add(operandLabel1);
        calculatorPanel.add(operandLabel2);
        calculatorPanel.add(resultWritingLabel);
        calculatorPanel.add(operandTextField1);
        calculatorPanel.add(operandTextField2);
        calculatorPanel.add(resultLabel);
        calculatorPanel.add(addButton);
        calculatorPanel.add(subtractButton);
        calculatorPanel.add(multiplyButton);

        mainPanel.add(clockPanel, BorderLayout.NORTH);
        mainPanel.add(calculatorPanel, BorderLayout.CENTER);

        init();

        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void init() {
        Clock clock = new Clock(clockLabel);
        clock.clockThread.start();
    }

    ;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ZadDom1().setVisible(true);
            }
        });
    }
}