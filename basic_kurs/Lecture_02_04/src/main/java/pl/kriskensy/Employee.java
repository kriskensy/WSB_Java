package pl.kriskensy;

public class Employee {
    private String name;
    private String surname;
    private int ID;

    //to pole jest statyczne (klasowe) bo ma wspolna wartosc dla wszystkich obeiktow danej kalsy (kazdy parcownik ma ta
    // sama wartosc tego pola)
    private static int numberOfAddedEmployees;

    //to jest inicjalizacja czyli nadawanie poczatkowej wartosci polu statycznemu
    static {
        numberOfAddedEmployees = 0;
    }

    //ta funkcja jest statyczna (klasowa) bo uzywa wylacznie pol klasowych, i moze byc wywolywana na rzecz obiektu ale tez klasy
    public static int getNumberOfAddedEmployees() {
        return numberOfAddedEmployees;
    }
    public Employee(String name, String surname, int ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        numberOfAddedEmployees++;
    }

    public void display() {
        System.out.println("Employee data: ");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + ID);
    }
}