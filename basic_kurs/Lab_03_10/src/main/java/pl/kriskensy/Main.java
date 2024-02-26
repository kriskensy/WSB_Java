//Zad 10 - Napisz program który pobierze liczby z parametrów i wykona na nich operacje arytmetyczne.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        //tutaj tylko wyswietlenie paramterow
        System.out.println("Number of parameters: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Parameter " + i + ": " + args[i]);
        }
        System.out.println();

        //aby wykonac dzialania arytmetyczne na parametrach trzeba je sparsowac na liczby.
        //if to takie male zabezpieczenie, ze potrzeba dokladnie 2 parametrow do wykonania pozniejszych operacji arytmetycznych.

        if (args.length == 2) {
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);

            System.out.println("Addition: " + (firstNumber + secondNumber));
            System.out.println("Subtraction: " + (firstNumber - secondNumber));
            System.out.println("Multiplication: " + firstNumber * secondNumber);
            System.out.println("Division: " + firstNumber / secondNumber);
        } else {
            System.out.println("False number of parameters.");
        }
    }
}