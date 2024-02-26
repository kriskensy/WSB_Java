package pl.kriskensy;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double figureField() {
        return Math.round(3.14 * radius * radius);
    }

    public double figureCircuit() {
        return Math.round(2 * 3.14 * radius);
    }

    @Override
    public void printFigureInformations() {
        super.printFigureInformations();
        System.out.print(figureField());
        System.out.println(" and a circuit of: " + figureCircuit());
    }
}