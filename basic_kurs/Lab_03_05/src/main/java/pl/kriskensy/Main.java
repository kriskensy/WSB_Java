//Zad 5 - Przetestować działanie operatorów oraz  ustalić ich kolejność.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        int firstNumber = 15;
        int secondNumber = -5;

        //arytmetyczne
        System.out.println("multiplication: " + firstNumber * secondNumber);
        System.out.println("division: " + firstNumber / secondNumber);
        System.out.println("addition: " + (firstNumber + secondNumber));
        System.out.println("subtraction: " + (firstNumber - secondNumber));
        System.out.println("modulo: " + firstNumber % secondNumber);
        System.out.println();

        //inkrementacja, dekremnetacja
        System.out.println("increment: ");
        System.out.println(firstNumber);
        firstNumber++;
        System.out.println(firstNumber);
        firstNumber--;
        System.out.println(firstNumber);

        //porównania -> dla zobrazowania zależności wplecione w instrukcje warunkowe if
        System.out.print("> ");
        if (firstNumber > secondNumber) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.print("== ");
        if (firstNumber == secondNumber) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.print("!= ");
        if (firstNumber != secondNumber) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //and, or
        if (firstNumber > 0 && secondNumber > 0) {
            System.out.println("both numbers are positive: " + true);
        } else {
            System.out.println("both numbers are positive: " + false);
        }

        if (firstNumber < 0 || secondNumber < 0) {
            System.out.println("minimum one number is negative: " + true);
        } else {
            System.out.println("minimum one number is negative: " + false);
        }
    }
}