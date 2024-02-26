package pl.kriskensy;

public class Plansza {
    private int szerokość;
    private int wysokość;

    public Plansza(int szerokość, int wysokość) {
        this.szerokość = szerokość;
        this.wysokość = wysokość;
    }

    public void wyświetlInformacje() {
        System.out.println("Plansza gry o wymiarach " + szerokość + "x" + wysokość);
    }
}
