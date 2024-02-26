package pl.kriskensy;

public abstract class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void displayInfo();
}