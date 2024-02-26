package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wyklad 2");

        BankAccount ba1 = new BankAccount("PKO", "PL5487964");
        Employee e1 = new Employee("kris", "kowalski", 1, ba1);
        e1.print();
    }
}