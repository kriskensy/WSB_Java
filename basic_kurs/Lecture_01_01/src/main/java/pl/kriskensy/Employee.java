package pl.kriskensy;

public class Employee {
    private String name;
    private String surname;
    private int ID;

    //konstruktor domyslny
    public Employee() {
        name = "pracownik";
        surname = "domyslny";
    }

    //inny konstruktor
    public Employee(String name, String surname, int ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + ID);
    }
}