package Figures;

import java.lang.Math;

public class Ellipse extends Circle {
    private final double radius2;
    private final String figureName = "Figures.Ellipse";

    public Ellipse(double radius, int radius2) {
        super(radius2);
        this.radius2 = radius2;
    }

    public double square() {
        return 3.14 * radius * radius2;
    }

    public double perimeter() {
        return 2 * 3.14 * Math.sqrt((radius * radius2) / 2);
    }

    public String figureName() {
        return figureName;
    }
}