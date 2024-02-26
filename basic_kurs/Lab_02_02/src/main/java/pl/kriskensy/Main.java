package pl.kriskensy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Int: ");
        int variableInt = scanner.nextInt();

        System.out.println("Double: ");
        double variableDouble = scanner.nextDouble();

        System.out.println("Char: ");
        char variableChar = scanner.next().charAt(0); //pobranie pojedynczego znaku char odbywasie przez "podwojna" metode;
        // samo pobranie next oraz definicja znaku na konkretnym indeksie. Dla prostego pobrania indeks = 0.

        System.out.println("Boolean: ");
        boolean variableBoolean = scanner.nextBoolean();

        //tutaj rzutowania
        double variableIntToDouble = variableInt;
        int variableDoubleToInt = (int) variableDouble; //w ta strone wymagane jest podanie typu docelowego
        int variableCharToInt = variableChar;
        //aby przekonwertowac zmienna boolean na Stringa trzeba wykorzystac jedna z ponizszych metod
        String variableBooleanToString = String.valueOf(variableBoolean); //metoda 1
        variableBooleanToString = Boolean.toString(variableBoolean); //metoda 2

        System.out.println("Int to double: " + variableIntToDouble);
        System.out.println("Double to int: " + variableDoubleToInt);
        System.out.println("Char to int: " + variableCharToInt);
        System.out.println("Boolean to string: " + variableBooleanToString);
    }
}