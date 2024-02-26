//Zad 3 - Stworzyć tablicę typu bazowego i umieścić w niej różne obiekty klas pochodnych. Odwołać się do przesłoniętych metod.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorbike();

        for (Vehicle vehicle : vehicles) {
            vehicle.printObjectInformations();
        }
    }
}