package pl.kriskensy;

public class BankAccount {
    private String bankName;
    private String accountNumber;

    public BankAccount(String bankName, String accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    public void print() {
        System.out.println("Bankname:" + bankName);
        System.out.println("Accountnumber:" + accountNumber);
    }
}