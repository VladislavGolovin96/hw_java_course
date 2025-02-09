package Figures;

public class Rectangle extends Square{
    private final int length;
    private final String figureName = "Figures.Rectangle";

    public Rectangle (int width, int length) {
        super(width);
        this.length = length;
    }

    public double square () {
        return width * length;
    }

    public double perimeter () {
        return (width + length) * 2;
    }

    public String figureName() {
        return figureName;
    }
}