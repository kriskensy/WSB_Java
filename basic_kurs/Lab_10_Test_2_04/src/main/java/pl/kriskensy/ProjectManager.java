package pl.kriskensy;

public class ProjectManager implements Employee {
    private String department;

    public ProjectManager(String department) {
        this.department = department;
    }

    @Override
    public void doTheWork() {
        System.out.println("Project manager is working with 5 programmers in his " + department + " department.");
    }

    @Override
    public String showDescription() {
        return "Project manager is the head of the " + department + " department.";
    }
}