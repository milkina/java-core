package inheritance;

public class Rectangle2 extends Figure2 {
    private String figureName;

    public Rectangle2(double dim1, double dim2) {
        super(dim1, dim2);
        figureName = "прямоугольник";
    }

    public double area() {
        System.out.println("Текущая фигура - " + figureName);
        return dim1 * dim2;
    }
}
