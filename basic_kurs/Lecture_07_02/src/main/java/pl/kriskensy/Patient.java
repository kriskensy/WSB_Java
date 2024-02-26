package pl.kriskensy;

public class Patient extends Person {
    private String patientID;

    public Patient(String name, String surname, String patientID) {
        super(name, surname);
        this.patientID = patientID;
    }

    public String GetPatientID() {
        return patientID;
    }
}