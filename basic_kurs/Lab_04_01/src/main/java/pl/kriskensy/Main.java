//Zad 1 - Przetestować działanie konstruktorów z parametrami lub bez.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Car firstcar = new Car();
        firstcar.printCar();
        System.out.println();

        Car secondCar = new Car("BMW", "M6");
        secondCar.printCar();
        System.out.println();

        Car thirdCar = new Car("Audi", "A8", 2023, "black");
        thirdCar.printCar();
        System.out.println();
    }
}