package pl.kriskensy;

public class Agreement {

    public void printAgreement(AuditProject project) {
        System.out.println();
        System.out.println("===Agreement===");
        project.projectData();
        System.out.println("Amount: " + project.quotation());
    }

    public void printAgreement(ProgrammingProject project) {
        System.out.println();
        System.out.println("===Agreement===");
        project.projectData();
        System.out.println("Amount: " + project.quotation());
    }

    public void printAgreement(HelpdeskProgrammingProject project) {
        System.out.println();
        System.out.println("===Agreement===");
        project.projectData();
        System.out.println("Amount: " + project.quotation());
    }
}