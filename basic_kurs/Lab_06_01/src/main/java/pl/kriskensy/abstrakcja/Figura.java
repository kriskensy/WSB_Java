package pl.kriskensy.abstrakcja;

abstract class Figura {
    // Konstruktor, pola, metody z implementacją
// Metoda abstrakcyjna bez implementacji
    abstract double obliczPole();
    // Metoda z implementacją
    void wyswietlInformacje() {
        System.out.println("To jest figura.");
    }
}