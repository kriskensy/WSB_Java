package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wyklad 2");

        Employee e1 = new Employee("kris", "kowalski", 1);
        e1.display();

        System.out.println("Number of employees (class): " + Employee.getNumberOfAddedEmployees()); //tak robic
        System.out.println("Number of employess (object): " + e1.getNumberOfAddedEmployees()); //tak nie robic
    }
}