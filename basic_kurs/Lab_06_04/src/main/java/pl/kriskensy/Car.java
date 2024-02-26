package pl.kriskensy;

public class Car {
    private String brand;
    private String model;
    private int yearOfProduction;

    public Car(String brand, String model, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return brand.equals(car.brand) && model.equals(car.model) && yearOfProduction == car.yearOfProduction;
    }
}