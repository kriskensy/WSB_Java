//Zad 12 - Stwórz klasę Kalkulator zawierającą różne metody przeciążone, które będą wykonywały podstawowe operacje
// matematyczne (dodawanie, odejmowanie, mnożenie, dzielenie) dla różnych typów danych (int, double).
// Dodaj także przeciążoną metodę do obliczania potęgi liczby.
package pl.kriskensy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("(int) addition: " + calculator.add(4, 2));
        System.out.println("(int) subtraction: " + calculator.sub(4, 2));
        System.out.println("(int) multiplication: " + calculator.multi(4, 2));
        System.out.println("(int) division: " + calculator.div(4, 2));
        System.out.println("(int) power: " + calculator.pow(4, 2));

        System.out.println("(double) addition: " + calculator.add(4.0, 2.0));
        System.out.println("(double) subtraction: " + calculator.sub(4.0, 2.0));
        System.out.println("(double) multiplication: " + calculator.multi(4.0, 2.0));
        System.out.println("(double) division: " + calculator.div(4.0, 2.0));
        System.out.println("(double) power: " + calculator.pow(4.0, 2.0));
    }
}