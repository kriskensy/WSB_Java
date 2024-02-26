package pl.kriskensy;

public class Car extends Vehicle {
    private String engineType;
    private int doorsNumber;

    public Car(String brand, int yearOfProduction, String engineType, int doorsNumber) {
        super(brand, yearOfProduction);
        this.engineType = engineType;
        this.doorsNumber = doorsNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }
}