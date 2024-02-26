//zad 2 - Stwórz klasę Osoba z prywatnymi polami takimi jak np. imie, nazwisko i wiek.
//Następnie utwórz metody dostępowe (gettery i settery), aby uzyskać dostęp do tych
//pól. Dopisz metody pozwalające ci wprowadzanie tych danych.
package pl.kriskensy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jacek", "Kowalski", 42);
        person.methodPrintInformation();
        System.out.println();

        person.methodSetName();
        person.methodSetSurname();
        person.methodSetAge();

        person.methodPrintInformation();
    }
}