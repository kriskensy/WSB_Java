package pl.kriskensy;

//klasa MedicalProcedure dziala na pewnym typie T pod ktore bedzie podstawione raz lekarz, raz ratonwik medyczny, itd.
//Dzieki temu nie ma potrzeby tworzenia kolejnej klasy MedicalProcedure
public class MedicalProcedure<T> {
    private T contractor;
    private Patient patient;

    public MedicalProcedure(T contractor, Patient patient) {
        this.contractor = contractor;
        this.patient = patient;
    }

    public T GetContractor() {
        return this.contractor;
    }

    public Patient GetPatient() {
        return this.patient;
    }
}