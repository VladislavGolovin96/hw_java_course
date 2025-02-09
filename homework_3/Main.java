import Figures.*;

public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(2);
        Ellipse ellipse = new Ellipse(4, 5);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(3);

        Figure[] figures = {circle, ellipse, rectangle, square};

        for (Figure figure : figures) {
            System.out.println("Perimeter for " + figure.figureName() + " is: " + figure.perimeter());
            System.out.println("Sqare for " + figure.figureName() + " is : " + figure.square() + "\n");
        }
    }
}