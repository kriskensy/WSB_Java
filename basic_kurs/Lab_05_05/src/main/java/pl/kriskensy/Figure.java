package pl.kriskensy;

public class Figure {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printFigureInformations() {
        System.out.print("The " + this.name + " you created is " + this.color + " and has an area of: ");
    }
}