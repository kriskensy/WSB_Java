package pl.kriskensy;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public double figureField() {
        return side * side;
    }

    public int figureCircuit() {
        return 4 * side;
    }

    @Override
    public void printFigureInformations() {
        super.printFigureInformations();
        System.out.print(figureField());
        System.out.println(" and a circuit of: " + figureCircuit());
    }
}