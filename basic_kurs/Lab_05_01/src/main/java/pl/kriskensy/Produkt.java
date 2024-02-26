package pl.kriskensy;

public class Produkt {

    private String nazwa;
    private double cena;

    // Dodaj gettery i settery dla nazwy
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    // Dodaj gettery i settery dla ceny
    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena >= 0) {
            this.cena = cena;
        } else {
            System.out.println("Cena nie może być ujemna.");
        }
    }
}
