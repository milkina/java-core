package inheritance;

public class Figure {
    double dimension1;
    double dimension2;

    public Figure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double calculateArea() {
        System.out.println("Площадь фигуры не определена.");
        return 0;
    }
}
