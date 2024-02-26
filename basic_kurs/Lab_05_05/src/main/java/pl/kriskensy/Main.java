//zad 5 - Stwórz klasę Figura, która będzie reprezentować ogólną figurę geometryczną. Klasa powinna zawierać pola prywatne
//nazwa (typu String) i kolor (typu String). Dodaj konstruktor, który umożliwia ustawienie tych pól.
//Następnie utwórz dwie podklasy: Kwadrat i Kolo. Obie te klasy powinny dziedziczyć po klasie Figura. Dodaj
//dodatkowe pola specyficzne dla każdej figury, takie jak bok dla kwadratu i promień dla koła. Dodaj konstruktory
//dla każdej z tych klas, które pozwolą na ustawienie zarówno pól dziedziczonych, jak i specyficznych dla danej figury.
//Dodaj metody do obliczania pola i obwodu dla każdej figury
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Square square = new Square("Big square", "black", 5);
        Circle circle = new Circle("Big circle", "red", 10);

        square.printFigureInformations();

        circle.printFigureInformations();
    }
}