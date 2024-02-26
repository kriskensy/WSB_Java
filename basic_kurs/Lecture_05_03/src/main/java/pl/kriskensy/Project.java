package pl.kriskensy;

public class Project {
    private String title;
    private String description;
    protected double additionalCosts;

    public Project (String title, String description, double additionalCosts) {
        this.title = title;
        this.description = description;
        this.additionalCosts = additionalCosts;
    }

    public void projectData() {
        System.out.println("Project data:");
        System.out.println("Title: " + this.title);
        System.out.println("Description: " + this.description);
        System.out.println("Additionals costs: " + this.additionalCosts);
    }
}