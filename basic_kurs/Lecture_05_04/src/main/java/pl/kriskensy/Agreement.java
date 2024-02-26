package pl.kriskensy;

public class Agreement {

    public void printAgreement(Project project) {
        System.out.println();
        System.out.println("===Agreement===");
        project.projectData();
        System.out.println("Amount: " + project.quotation());
    }
}