//zad 6 - Stwórz hierarchię klas reprezentującą różne typy pojazdów. W hierarchii tej powinny być przynajmniej trzy klasy: Pojazd, Samochod i Motocykl.
//Pojazd:
//o Klasa bazowa, zawierająca ogólne informacje o pojazdach, takie jak marka i rokProdukcji.
//o Dodaj konstruktor i metody dostępowe.
//Samochod:
//o Klasa dziedzicząca po Pojazd, dodająca specyficzne dla samochodu informacje, takie jak liczbaDrzwi i typSilnika.
//o Dodaj konstruktor i metody dostępowe.
//Motocykl:
//o Klasa dziedzicząca po Pojazd, dodająca specyficzne dla motocykla informacje, takie jak typNapedu i pojemnoscSilnika.
//o Dodaj konstruktor i metody dostępowe.
//W głównym programie utwórz obiekty każdej z tych klas i wykonaj rzutowanie między nimi. Na przykład,
//utwórz obiekt Samochod i spróbuj rzutować go na Pojazd. Następnie utwórz obiekt Motocykl i spróbuj rzutować go na Pojazd.
//Sprawdź, czy rzutowanie się powiedzie i czy możesz uzyskać dostęp do pól i metod właściwych dla danego typu pojazdu.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Vehicle carUPToVehicle = new Car("Audi", 2023, "Diesel", 5);
        carUPToVehicle.getBrand();

        Vehicle motorbikeUPToVehicle = new Motorbike("Ducati", 1999, "Allrad", 500);
        motorbikeUPToVehicle.getBrand();

        Vehicle carDOWNToVehicle = new Car("BMW", 2023, "Diesel", 5);
        if (carDOWNToVehicle instanceof Car) {
            Car car = (Car) carDOWNToVehicle;
            car.getEngineType();
        }


        Vehicle motorbikeDOWNToVehicle = new Motorbike("Honda", 2000, "Allrad", 800);
        if (motorbikeDOWNToVehicle instanceof Motorbike) {
            Motorbike motorbike = (Motorbike) motorbikeDOWNToVehicle;
            motorbike.getEngineCapacity();
        }
    }
}