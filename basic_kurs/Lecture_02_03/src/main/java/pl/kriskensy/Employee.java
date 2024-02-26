package pl.kriskensy;

public class Employee {
    private String name;
    private String surname;
    private int ID;

    public Employee(String name, String surname, int ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }

    //wywolanie jednego konstruktora w drugim konstruktorze za pomoca "this"
    public Employee(String name, String surname) {
        this(name, surname, 0);
    }

//    public Employee(String name, String surname) {
//        this.name = name;
//        this.surname = surname;
//        this.ID = 0;
//    }

    public void display() {
        System.out.println("Employee data: ");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + ID);
    }
}