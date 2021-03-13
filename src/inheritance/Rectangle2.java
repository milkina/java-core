package inheritance;

public class Rectangle2 extends Figure2 {
    public Rectangle2(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double calculateArea() {
        System.out.println("B области четырехугольника.");
        return dimension1 * dimension2;
    }
}
