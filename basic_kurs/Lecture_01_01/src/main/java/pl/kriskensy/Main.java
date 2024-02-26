package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wyklad 1");

        Employee e1 = new Employee();
        e1.display();

        Employee e2 = new Employee("kris", "kowalski", 2);
        e2.display();

        Employee e3 = new Employee("Jan", "Nowak");
        e3.display();
    }
}