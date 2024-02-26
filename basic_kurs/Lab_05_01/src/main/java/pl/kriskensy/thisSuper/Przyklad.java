package pl.kriskensy.thisSuper;

public class Przyklad {
    private int liczba;

    public Przyklad(int liczba) {
        this.liczba = liczba;
    }

    public void ustawLiczbe(int liczba) {
// Użycie 'this' pomaga uniknąć konfliktu nazw i jednoznacznie wskazuje na pole obiektu.
        this.liczba = liczba;
    }

    public void wyswietlLiczbe() {
        System.out.println("Liczba: " + this.liczba);
    }
}