//Zad 4 - Przetestować działanie słów kluczowych break i continue wraz z etykietą.
package pl.kriskensy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.println("BREAK"); //przerwanie i wyskok do etykiety jak tylko warunek nie jest spelniony
        labelForBreak:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("give me a number that is bigger than 3: ");
                number = scanner.nextInt();

                if (number <= 3) break labelForBreak; //warunek dla przerwania petli
            }
        }

        //przykladowy if na sprawdzenie
        if (number <= 3) {
            System.out.println("wrong number");
        } else {
            System.out.println("all numbers are ok!");
        }

        System.out.println("CONTINUE"); //pominiecie reszty biezacej iteracji wewnetrznej petli ale kontynuacja petli zewnetrznej
        labelForContinue:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("give me a number that is bigger than 3: ");
                number = scanner.nextInt();

                if (number <= 3) continue labelForContinue; //warunek dla przerwania petli wewnetrznej
            }
        }
    }
}