package pl.kriskensy;

import java.util.Scanner;

public class WskaznikBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what ist your weight (in kg)? ");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.println("what is your height (in m)? ");
        double height = Double.parseDouble(scanner.nextLine());

        BMIcomments(BMIresult(height, weight));
    }

    public static double BMIresult(double height, double weight) {
        double bmi = weight / (height * height);
        return Math.round(bmi * 100) / 100.0;
    }

    public static void BMIcomments(double bmi) {
        System.out.println("your BMI is: " + bmi);
        if (bmi <= 20.5) {
            System.out.println("you should eat Schabowy!");
        } else if (bmi > 20.5 && bmi < 24.0) {
            System.out.println("top form!");
        } else {
            System.out.println("go to gym!");
        }
    }
}