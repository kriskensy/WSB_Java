package pl.kriskensy;

import javax.swing.*;

public class Prog01 {
    public static void main(String[] args) {

        JFrame myFirstWindow = new JFrame("my first window");
        myFirstWindow.setSize(600, 600);
        myFirstWindow.setVisible(true);

        myFirstWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}