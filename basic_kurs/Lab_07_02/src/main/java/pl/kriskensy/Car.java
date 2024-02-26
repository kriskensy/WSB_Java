package pl.kriskensy;

public class Car implements Vehicle {
    private String vin;
    protected int yearOfProduction;
    public String brand;
    public String model;

    public Car(String vin, int yearOfProduction, String brand, String model) {
        this.vin = vin;
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car: " + brand + " " + model + ", year of production " + yearOfProduction + " has VIN number: " + vin;
    }
}