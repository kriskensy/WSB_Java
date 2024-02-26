package pl.kriskensy;

public class Car {
    private String brand;
    private String model;
    private double engineCapacity;

    public Car(String brand, String model, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car " + brand + " " + model + " has " + engineCapacity + " engine capacity.";
    }
}