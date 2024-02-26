package pl.kriskensy;

public class AuditProject extends Project {
    private double specialistNumberOfPersonMonth;
    private double seniorSpecialistNumberOfPersonMonth;

    public AuditProject(String title, String description, double additionalCosts, double specialistNumberOfPersonMonth,
                        double seniorSpecialistNumberOfPersonMonth) {
        super(title, description, additionalCosts);
        this.specialistNumberOfPersonMonth = specialistNumberOfPersonMonth;
        this.seniorSpecialistNumberOfPersonMonth = seniorSpecialistNumberOfPersonMonth;
    }

    public void projectData() {
        super.projectData();
        System.out.println("Specialist number of person-month: " + this.specialistNumberOfPersonMonth);
        System.out.println("Senior specialist number of person-month: " + this.seniorSpecialistNumberOfPersonMonth);
    }

    public double quotation() {
        return this.specialistNumberOfPersonMonth * new BusinessPaycheck().AuditSpecialistAverageSalary()
                + this.seniorSpecialistNumberOfPersonMonth * new BusinessPaycheck().AuditSeniorSpecialistAverageSalary()
                + this.additionalCosts;
    }
}