package pl.kriskensy;

public class Agreement {

    public void printAgreement(IObjectToAgreement iObjectToAgreement) {
        System.out.println();
        System.out.println("===Agreement===");
        iObjectToAgreement.data();
        System.out.println("Amount: " + iObjectToAgreement.quotation());
    }
}