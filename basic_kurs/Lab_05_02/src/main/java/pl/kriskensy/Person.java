package pl.kriskensy;

import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void methodSetName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set a new name: ");
        this.name = scanner.nextLine();
    }

    public void methodSetSurname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set a new surname: ");
        this.surname = scanner.nextLine();
    }

    public void methodSetAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set a new age: ");
        this.age = scanner.nextInt();
    }

    public void methodPrintInformation() {
        System.out.println("name: " + getName());
        System.out.println("surname: " + getSurname());
        System.out.println("age: " + getAge());
    }
}