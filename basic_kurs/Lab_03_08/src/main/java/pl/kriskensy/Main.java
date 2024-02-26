//Zad 8 - Wykonaj kod z instrukcji laboratoryjnej dotyczący parametrów programów wyniki umieść w sprawozdaniu.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        // args to parametry programu przekazane z wiersza poleceń
        // args.length to liczba przekazanych parametrów

        System.out.println("Number of parameters: " + args.length);

        // Wyświetlenie wszystkich przekazanych parametrów
        for (int i = 0; i < args.length; i++) {
            System.out.println("Parameter " + i + ": " + args[i]);
        }
    }
}