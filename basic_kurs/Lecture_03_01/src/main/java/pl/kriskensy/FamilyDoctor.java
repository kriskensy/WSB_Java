package pl.kriskensy;

public class FamilyDoctor extends Person {
    private double numberOfPatients;

    public FamilyDoctor(String name, String surname, double numberOfPatients) {
        super(name, surname); //wywolanie konstruktora z klasy Person, czyli wywolanie name + surname
        this.numberOfPatients = numberOfPatients;
    }

    public void print() {
        super.print(); //wywolanie metody print z klasy Person, czyli wyswietlenie name + surname
        System.out.println("Number of patients: " + this.numberOfPatients);
    }

    public double paycheck(){
        return this.numberOfPatients *
                new FinancialParameters().GetAmountPerBasicContractPatient();
        //tworze sobie obiekt "anonimowy" i na nim wywoluje metode GetAmount...
    }
}