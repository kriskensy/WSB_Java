package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        Bookkeeping bookkeeping = new Bookkeeping();

        FamilyDoctor fd = new FamilyDoctor("Adam", "Rodzinny", 100);
        bookkeeping.printTransferOrder(fd);

        SpecialistDoctor sd = new SpecialistDoctor("Adam", "Specjalista", 100);
        bookkeeping.printTransferOrder(sd);

        //nie wolno tworzyc obiektow klasy abstrakcyjnej
        //PersonWithContract personWithContract = new PersonWithContract();
    }
}