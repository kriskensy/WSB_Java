package pl.kriskensy;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }

    public String toString() {
        return name + " " + surname;
    }
}