package pl.kriskensy;

import java.util.Scanner;

public class Paycheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] paychecks = new int[5];
        int[] moneyDenominations = {100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < paychecks.length; i++) {
            paychecks[i] = (int) (Math.random() * 2200 + 800);
            System.out.println("Paycheck employee " + (i + 1) + ": " + paychecks[i] + "€");

            for (int money : moneyDenominations) {
                if (paychecks[i] / money > 0) {
                    System.out.println("Money: " + money + " € - " + paychecks[i] / money + "x.");
                    paychecks[i] %= money;
                }
            }
        }
    }
}