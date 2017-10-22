package inheritance;

public class Rectangle2 extends Figure2 {
    public Rectangle2(double dim1, double dim2) {
        super(dim1, dim2);
        this.setFigureName("прямоугольник");
    }

    public double area() {
        System.out.println("Текущая фигура - " + this.getFigureName());
        return dim1 * dim2;
    }
}
