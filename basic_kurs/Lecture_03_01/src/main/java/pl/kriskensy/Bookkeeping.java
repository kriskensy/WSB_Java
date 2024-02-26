package pl.kriskensy;

public class Bookkeeping {
    public void printTransferOrder(FamilyDoctor fd) {
        System.out.println("Transfer order");
        System.out.println("Name and surname: ");
        fd.print();
        System.out.println("Transfer amount: " + fd.paycheck());
        System.out.println();
    }

    public void printTransferOrder(SpecialistDoctor fd) {
        System.out.println("Transfer order");
        System.out.println("Name and surname: ");
        fd.print();
        System.out.println("Transfer amount: " + fd.paycheck());
        System.out.println();
    }
}