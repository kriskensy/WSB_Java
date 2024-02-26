package pl.kriskensy.obiektyAnonimowe;

public class Aplikacja {
    public static void main(String[] args) {
// Utworzenie obiektu anonimowego implementującego interfejs Komunikat
        Komunikat powitanie = new Komunikat() {
            @Override
            public void wyswietl(String tresc) {
                System.out.println("Witaj! " + tresc);
            }
        };
// Wywołanie metody obiektu anonimowego
        powitanie.wyswietl("Dziś jest piękny dzień!");
    }
}