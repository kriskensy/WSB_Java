package pl.kriskensy;

public class Driver implements Vehicle {
    private String pesel;
    protected String surname;
    public String name;
    public int age;

    public Driver(String pesel, String surname, String name, int age) {
        this.pesel = pesel;
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver " + name + " " + surname + ", age of " + age + " and PESEL: " + pesel;
    }
}