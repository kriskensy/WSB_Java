package pl.kriskensy;

public class ProgrammingProject extends Project {
    private double juniorProgrammerNumberOfPersonMonth;
    private double programmerNumberOfPersonMonth;
    private double seniorProgrammerNumberOfPersonMonth;
    private double designerNumberOfPersonMonth;
    private double testerNumberOfPersonMonth;

    public ProgrammingProject(String title, String description, double additionalCosts, double juniorProgrammerNumberOfPersonMonth,
                              double programmerNumberOfPersonMonth, double seniorProgrammerNumberOfPersonMonth,
                              double designerNumberOfPersonMonth, double testerNumberOfPersonMonth) {
        super(title, description, additionalCosts);
        this.juniorProgrammerNumberOfPersonMonth = juniorProgrammerNumberOfPersonMonth;
        this.programmerNumberOfPersonMonth = programmerNumberOfPersonMonth;
        this.seniorProgrammerNumberOfPersonMonth = seniorProgrammerNumberOfPersonMonth;
        this.designerNumberOfPersonMonth = designerNumberOfPersonMonth;
        this.testerNumberOfPersonMonth = testerNumberOfPersonMonth;
    }

    public void data() {
        super.data();
        System.out.println("Junior programmer number of person-month: " + this.juniorProgrammerNumberOfPersonMonth);
        System.out.println("Programmer number of person-month: " + this.programmerNumberOfPersonMonth);
        System.out.println("Senior programmer number of person-month: " + this.seniorProgrammerNumberOfPersonMonth);
        System.out.println("Designer number of person-month: " + this.designerNumberOfPersonMonth);
        System.out.println("Tester number of person-month: " + this.testerNumberOfPersonMonth);
    }

    public double quotation() {
        BusinessPaycheck businessPaycheck = new BusinessPaycheck();
        return this.juniorProgrammerNumberOfPersonMonth * businessPaycheck.JuniorProgrammerAverageSalary()
                + this.programmerNumberOfPersonMonth * businessPaycheck.ProgrammerAverageSalary()
                + this.seniorProgrammerNumberOfPersonMonth * businessPaycheck.SeniorProgrammerAverageSalary()
                + this.designerNumberOfPersonMonth * businessPaycheck.DesignerAverageSalary()
                + this.testerNumberOfPersonMonth * businessPaycheck.TesterAverageSalary()
                + this.additionalCosts;
    }
}