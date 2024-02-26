package pl.kriskensy;

public class Gra {
    private Plansza plansza;
    private Gracz gracz;

    public Gra(Plansza plansza, Gracz gracz) {
        this.plansza = plansza;
        this.gracz = gracz;
    }

    public void rozpocznijGre() {
        plansza.wyświetlInformacje();
        gracz.poruszGraczem(2, 3);
    }
}
