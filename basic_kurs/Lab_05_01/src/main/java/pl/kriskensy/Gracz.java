package pl.kriskensy;

public class Gracz {
    private Postac postac;

    public Gracz(Postac postac) {
        this.postac = postac;
    }

    public void poruszGraczem(int noweX, int noweY) {
        postac.porusz(noweX, noweY);
    }
}
