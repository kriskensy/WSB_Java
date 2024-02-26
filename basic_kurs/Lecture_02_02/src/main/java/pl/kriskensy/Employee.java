package pl.kriskensy;

public class Employee {
    private String name;
    private String surname;
    private int ID;
    private BankAccount bankAccount;

    public Employee(String name, String surname, int ID, String bankAccountBankName, String bankAccountNumber) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.bankAccount = new BankAccount(bankAccountBankName, bankAccountNumber);
    }

    public void display() {
        System.out.println("Employee data: ");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + ID);
        System.out.println("Employee bank account data: ");
        bankAccount.display(); //tutaj wywolanie metody display() z klasy BankAccount
    }
}