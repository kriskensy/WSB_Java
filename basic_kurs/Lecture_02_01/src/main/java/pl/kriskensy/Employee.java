package pl.kriskensy;

public class Employee {
    private String name;
    private String surname;
    private int ID;
    private BankAccount bankAccount;

    public Employee(String name, String surname, int ID, BankAccount bankAccount) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.bankAccount = bankAccount;
    }

    public void print() {
        System.out.println("Employee data:");
        System.out.println("Name:" + name);
        System.out.println("Surname:" + surname);
        System.out.println("ID:" + ID);
        System.out.println("Employee bank account data: ");
        bankAccount.print(); //tutaj wywolanie metody display() z klasy BankAccount
    }
}