package Figures;

public class Circle extends Figure {
    protected int radius;
    private final String figureName = "Figures.Circle";

    public Circle(int radius) {
        this.radius = radius;
    }

    public double square() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public String figureName() {
        return figureName;
    }
}