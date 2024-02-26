package pl.kriskensy;

public class BankAccount {
    private String bankName;
    private String accountNumber;

    public BankAccount(String bankName, String accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    public void display() {
        System.out.println("Bank name: " + bankName);
        System.out.println("Account number: " + accountNumber);
    }
}