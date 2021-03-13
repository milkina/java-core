package inheritance;

public class Rectangle extends Figure {
    public Rectangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double calculateArea() {
        System.out.println("B области четырехугольника.");
        return dimension1 * dimension2;
    }
}
