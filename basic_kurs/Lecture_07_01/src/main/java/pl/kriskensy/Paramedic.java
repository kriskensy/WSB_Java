package pl.kriskensy;

public class Paramedic extends Person {
    private String descriptionOfPermissions;

    public Paramedic(String name, String surname, String descriptionOfPermissions) {
        super(name, surname);
        this.descriptionOfPermissions = descriptionOfPermissions;
    }

    public String GetDescriptionOfPermissions() {
        return this.descriptionOfPermissions;
    }

    public float Paycheck(int workHours) {
        return workHours * 200;
    }
}