package pl.kriskensy;

public class MedicalProcedure {
    private Doctor contractor;
    private Patient patient;

    public MedicalProcedure(Doctor contractor, Patient patient) {
        this.contractor = contractor;
        this.patient = patient;
    }

    public Doctor GetContractor() {
        return this.contractor;
    }

    public Patient GetPatient() {
        return this.patient;
    }
}