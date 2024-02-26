package pl.kriskensy;

public class SpecialistDoctor extends Person{
    private double numberOfAdmittedPatients;

    public SpecialistDoctor(String name, String surname, double numberOfAdmittedPatients){
        super(name, surname);
        this.numberOfAdmittedPatients = numberOfAdmittedPatients;
    }

    public void print() {
        super.print();
        System.out.println("Number of admitted patients: " + this.numberOfAdmittedPatients);
    }

    public double paycheck() {
        return this.numberOfAdmittedPatients *
                new FinancialParameters().GetAmountPerSpecialistDoctorAdmittedPatient();
    }
}