package pl.kriskensy;

public class Car implements Vehicle {
    public Car() {
    }

    @Override
    public void addFuel() {
        System.out.println("Fuel added. You can drive!");
    }

    @Override
    public void drive() {
        System.out.println("Drive! drive! drive!");
    }

    @Override
    public void wheelReplacement() {
        System.out.println("The wheel has been changed!");
    }
}