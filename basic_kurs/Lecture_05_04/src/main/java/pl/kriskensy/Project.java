package pl.kriskensy;
//jezeli klasa zawiera conajmniej metode abstrakcyjna to musi byc abstrakcyjna
public abstract class Project {
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

    public abstract double quotation(); //funkcja abstrakcyjna to taka ktora ma asbtract z przodu i nie ma bloku.
    // Jak nie wiemy jak napisac dana funkcje w klasie w ktorej jestesmy a wiemy jak w klasie dziedziczacej to warto zrobic ja abstrakcyjna.
}