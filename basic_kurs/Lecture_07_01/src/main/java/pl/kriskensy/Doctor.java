package pl.kriskensy;

public class Doctor extends Person {

    private String specialty;

    public Doctor(String name, String surname, String specialty) {
        super(name, surname);
        this.specialty = specialty;
    }

    public String GetSpecialty() {
        return this.specialty;
    }

    public float Paycheck(int workHours) {
        return workHours * 300;
    }
}