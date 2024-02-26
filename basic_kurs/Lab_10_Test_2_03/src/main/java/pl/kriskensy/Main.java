//zad 3 - Stwórz aplikację Kalkulator zawierającą metody do obsługi jego funkcji bazując na przeciążeniu gdzie uzytkownik sam podaje dane.
package pl.kriskensy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operation choice:");
        System.out.println("1. Add");
        System.out.println("2. Subtr");
        System.out.println("3. Multi");
        System.out.println("4. Div");

        int operation = scanner.nextInt();

        Operation mathOperation = null;

        switch (operation) {
            case 1 -> mathOperation = new AdditionOperation();
            case 2 -> mathOperation = new SubtractionOperation();
            case 3 -> mathOperation = new MultiplicationOperation();
            case 4 -> mathOperation = new DivisionOperation();
            default -> {
                System.out.println("ERROR!");
                System.exit(0);
            }
        }

        mathOperation.mathOperation();
    }
}