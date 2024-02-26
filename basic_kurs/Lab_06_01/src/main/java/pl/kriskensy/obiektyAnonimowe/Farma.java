package pl.kriskensy.obiektyAnonimowe;

public class Farma {
    public static void main(String[] args) {
// Utworzenie obiektu anonimowego dziedziczącego po klasie abstrakcyjnej Zwierze
        Zwierze kura = new Zwierze() {
            @Override
            void dajGlos() {
                System.out.println("Kukuryku!");
            }
        };
// Wywołanie metody obiektu anonimowego
        kura.dajGlos();
    }
}