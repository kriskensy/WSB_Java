package pl.kriskensy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZadDom2 extends JFrame {
    private JPanel mainPanel;
    private JPanel timerPanel;
    private JPanel buttonsPanel;
    private JTextField timeField;
    private JButton startButton;
    private JButton stopButton;
    private JButton closeButton;
    private Timer timer;
    private int secondsToRun;

    public ZadDom2() {
        setTitle("Timer");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);

        mainPanel = new JPanel(new BorderLayout());
        timerPanel = new JPanel(new FlowLayout());
        buttonsPanel = new JPanel(new FlowLayout());

        timeField = new JTextField();
        timeField.setColumns(12);
        timeField.setFont(new Font("Serif", Font.PLAIN, 20));

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        closeButton = new JButton("Close");

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        timerPanel.add(timeField);

        buttonsPanel.add(startButton);
        buttonsPanel.add(stopButton);
        buttonsPanel.add(closeButton);

        mainPanel.add(timerPanel, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void startTimer() {
        try {
            secondsToRun = Integer.parseInt(timeField.getText());
            timer = new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (secondsToRun > 0) {
                        secondsToRun--;
                        timeField.setText(String.valueOf(secondsToRun));
                    } else {
                        timer.stop();
                    }
                }
            });
            timer.start();

        } catch (NumberFormatException e) {
            timeField.setText("it isn't a number!");
        }
    }

    private void stopTimer() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ZadDom2().setVisible(true);
            }
        });
    }
}