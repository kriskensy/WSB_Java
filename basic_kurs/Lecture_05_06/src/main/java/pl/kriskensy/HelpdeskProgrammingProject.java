package pl.kriskensy;

public class HelpdeskProgrammingProject extends ProgrammingProject {
    private double helpdeskNumberOfHours;

    public HelpdeskProgrammingProject(String title, String description, double additionalCosts, double juniorProgrammerNumberOfPersonMonth,
                                      double programmerNumberOfPersonMonth, double seniorProgrammerNumberOfPersonMonth,
                                      double designerNumberOfPersonMonth, double testerNumberOfPersonMonth, double helpdeskNumberOfHours) {
        super(title, description, additionalCosts, juniorProgrammerNumberOfPersonMonth,
                programmerNumberOfPersonMonth, seniorProgrammerNumberOfPersonMonth,
                designerNumberOfPersonMonth, testerNumberOfPersonMonth);
        this.helpdeskNumberOfHours = helpdeskNumberOfHours;
    }

    public void data() {
        super.data();
        System.out.println("Helpdesk number of hours: " + this.helpdeskNumberOfHours);
    }

    public double quotation() {
        return super.quotation() + this.helpdeskNumberOfHours * new BusinessPaycheck().HelpdeskAverageSalary();
    }
}