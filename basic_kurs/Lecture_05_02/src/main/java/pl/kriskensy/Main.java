package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        FamilyDoctor fd = new FamilyDoctor("Adam", "Rodzinny", 100);
        fd.printTransferOrder();

        SpecialistDoctor sd = new SpecialistDoctor("Adam", "Specjalista", 100);
        sd.printTransferOrder();
    }
}