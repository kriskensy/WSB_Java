package pl.kriskensy;

public class Programmer implements Employee {
    private String programmingLanguage;

    public Programmer(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void doTheWork() {
        System.out.println("Programmer is working on project, using " + programmingLanguage + " language.");
    }

    @Override
    public String showDescription() {
        return "Programmer's specialty is " + programmingLanguage + ".";
    }
}