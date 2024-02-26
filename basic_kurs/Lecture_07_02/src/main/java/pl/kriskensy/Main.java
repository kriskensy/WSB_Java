package pl.kriskensy;

//program z uzyciem typu generycznego -> BRAK powtarzalnosci kodu
public class Main {
    public static void main(String[] args) {
        System.out.println("przyklad typu generycznego");
        System.out.println();

        Patient p1 = new Patient("Adam", "Kot", "Patient_1");
        Doctor doc1 = new Doctor("Adam", "Nowak", "chirurg");
        Paramedic par1 = new Paramedic("Adam", "Medyczny", "dawanie zastrzykow");

        //tutaj typem T z procedury medycznej stal sie lekarz
        MedicalProcedure<Doctor> mp1 = new MedicalProcedure<Doctor>(doc1, p1);
        System.out.println(mp1.GetContractor().GetSurname());

        //tutaj typem T z procedury medycznej stal sie ratownik medyczny
        MedicalProcedure<Paramedic> mp2 = new MedicalProcedure<>(par1, p1);
        System.out.println(mp2.GetContractor().GetSurname());
    }
}