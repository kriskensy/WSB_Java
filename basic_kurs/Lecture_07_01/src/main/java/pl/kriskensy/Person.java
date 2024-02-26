package pl.kriskensy;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String GetName() {
        return name;
    }

    public String GetSurname() {
        return surname;
    }
}