package pl.kriskensy;

public class Postac {
    private int położenieX;
    private int położenieY;

    public Postac(int położenieX, int położenieY) {
        this.położenieX = położenieX;
        this.położenieY = położenieY;
    }

    public void porusz(int noweX, int noweY) {
        this.położenieX = noweX;
        this.położenieY = noweY;
        System.out.println("Gracz porusza się na pozycję (" + noweX + ", " + noweY + ")");
    }
}
