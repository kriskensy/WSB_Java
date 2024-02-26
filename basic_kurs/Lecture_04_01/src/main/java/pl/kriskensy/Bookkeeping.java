package pl.kriskensy;

public class Bookkeeping {
    public void printTransferOrder(PersonWithContract pwc) {
        System.out.println("Transfer order");
        System.out.println("Name and surname: ");
        pwc.print();
        System.out.println("Transfer amount: " + pwc.paycheck());
        System.out.println();
    }
}