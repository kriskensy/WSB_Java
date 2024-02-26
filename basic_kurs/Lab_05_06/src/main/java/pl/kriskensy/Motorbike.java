package pl.kriskensy;

public class Motorbike extends Vehicle {
    private String driveType;
    private double engineCapacity;

    public Motorbike(String brand, int yearOfProduction, String driveType, double engineCapacity) {
        super(brand, yearOfProduction);
        this.driveType = driveType;
        this.engineCapacity = engineCapacity;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}