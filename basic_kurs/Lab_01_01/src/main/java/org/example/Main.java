package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //potrzebny do wczytywania - zad 4

        System.out.println("Hello world!");
        System.out.println();

        //zad 3 - wymyslony student. Dane "na sztywno".

        System.out.println("First student:");
        System.out.println("Pan Tadeusz");
        System.out.println("Student ID: 1234-5678");
        System.out.println("Field of study: Computer Science");

        //zad 4 - dane studenta wprowadzane przez uzytkownika
        System.out.println();
        System.out.println("Second student: ");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Surname: ");
        String surname = scanner.nextLine();
        System.out.println("Student ID: ");
        String studentID = scanner.nextLine();
        System.out.println("Field of study: ");
        String fieldOfStudy = scanner.nextLine();

        System.out.println("Second student");
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Student ID: " + studentID);
        System.out.println("Field of study: " + fieldOfStudy);
    }
}