package pl.kriskensy;

import java.util.Scanner;

public class Czytacz {
    static Scanner scanner = new Scanner(System.in);

    static String dajString() {
        System.out.println("dej no stringa: ");
        return scanner.nextLine();
    }

    static double dajDouble() {
        System.out.println("dej dabla: ");
        return Double.parseDouble(scanner.nextLine());
    }

    static int dajInt() {
        System.out.println("dej inta: ");
        return Integer.parseInt(scanner.nextLine());
    }
}