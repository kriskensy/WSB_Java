package pl.kriskensy;

public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private int engineCapacity;

    public Car(String brand, String model, int engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car: " + brand + ", model: " + model + ", engine capacity: " + engineCapacity;
    }

    @Override
    public int compareTo(Car anotherCar) {
        return this.engineCapacity - anotherCar.engineCapacity;
    }
}