//cala klasa powtorzona -> brak typu generycznego
package pl.kriskensy;

public class MedicalProcedure2 {
    private Paramedic contractor;
    private Patient patient;

    public MedicalProcedure2(Paramedic contractor, Patient patient) {
        this.contractor = contractor;
        this.patient = patient;
    }

    public Paramedic GetContractor() {
        return this.contractor;
    }

    public Patient GetPatient() {
        return this.patient;
    }
}