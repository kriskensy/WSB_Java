package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        AuditProject auditProject = new AuditProject("Project 1", "Description 1",
                100, 1, 1);

        auditProject.printAgreement();

        ProgrammingProject programmingProject = new ProgrammingProject("Project 2", "Description 2",
                200, 2, 2,
                2, 2, 2);

        programmingProject.printAgreement();

        HelpdeskProgrammingProject helpdeskProgrammingProject = new HelpdeskProgrammingProject("Project 3",
                "Description 3", 300, 3, 3,
                3, 3, 3, 3);

        helpdeskProgrammingProject.printAgreement();
    }
}