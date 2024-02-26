package pl.kriskensy.dziedzieczenie;

public class Postac {
    private String imię;
    private int poziom;
    private int punktyŻycia;

    public Postac(String imię, int poziom, int punktyŻycia) {
        this.imię = imię;
        this.poziom = poziom;
        this.punktyŻycia = punktyŻycia;
    }

    public void atak() {
        System.out.println("Postać atakuje.");
    }

    public void otrzymajObrażenia(int obrażenia) {
        punktyŻycia -= obrażenia;
        System.out.println("Postać otrzymuje obrażenia. Pozostałe punkty życia: " + punktyŻycia);
    }
}