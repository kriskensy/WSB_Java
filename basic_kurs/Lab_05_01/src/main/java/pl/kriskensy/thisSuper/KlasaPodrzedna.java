package pl.kriskensy.thisSuper;

public class KlasaPodrzedna extends KlasaNadrzedna {
    int x = 20;

    void wyswietlX() {
        System.out.println("Wartość x w klasie podrzędnej: " + x);
        System.out.println("Wartość x w klasie nadrzędnej (super.x): " + super.x);
    }
}
