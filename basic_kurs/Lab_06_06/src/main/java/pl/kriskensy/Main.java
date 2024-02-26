//Zad 6 - Stworzyć obiekt anonimowy oraz klasę anonimową na podstawie interfejsu.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() {
            @Override
            public void drive() {
                System.out.println("Driving a car.");
            }
        };
        vehicle.drive();
    }
}