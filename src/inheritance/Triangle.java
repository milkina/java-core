package inheritance;

public class Triangle extends Figure {
    public Triangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double calculateArea() {
        System.out.println("B области треугольника.");
        return dimension1 * dimension2 / 2;
    }
}
