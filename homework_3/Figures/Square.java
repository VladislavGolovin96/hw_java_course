package Figures;

public class Square extends Figure {
    protected int width;
    private final String figureName = "Figures.Square";

    public Square(int width) {
        this.width = width;
    }

    public double square() {
        return width * width;
    }

    public double perimeter() {
        return width * 4;
    }

    public String figureName() {
        return figureName;
    }
}