package pl.kriskensy.dziedzieczenie;

public class Bohater extends Postac {
    private String umiejętność;

    public Bohater(String imię, int poziom, int punktyŻycia, String umiejętność) {
// Wywołanie konstruktora klasy nadrzędnej (Postać)
        super(imię, poziom, punktyŻycia);
        this.umiejętność = umiejętność;
    }

    // Dodatkowa metoda specyficzna dla klasy Bohater
    public void użyjUmiejętności() {
        System.out.println("Bohater używa umiejętności: " + umiejętność);
    }
}
