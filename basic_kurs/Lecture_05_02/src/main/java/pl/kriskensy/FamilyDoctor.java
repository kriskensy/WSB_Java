package pl.kriskensy;

public class FamilyDoctor extends Person {
    private double numberOfPatients;

    public FamilyDoctor(String name, String surname, double numberOfPatients) {
        super(name, surname);
        this.numberOfPatients = numberOfPatients;
    }

    public void print() {
        super.print();
        System.out.println("Number of patients: " + this.numberOfPatients);
    }

    public double paycheck(){
        return this.numberOfPatients *
                new FinancialParameters().GetAmountPerBasicContractPatient();
    }
}