package inheritance;

public class Triangle2 extends Figure2 {
    public Triangle2(double dim1, double dim2) {
        super(dim1, dim2);
        this.setFigureName("треугольник");
    }

    public double area() {
        System.out.println("Текущая фигура - " + this.getFigureName());
        return dim1 * dim2 / 2;
    }
}
