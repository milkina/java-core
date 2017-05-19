package inheritance;

public class Triangle2 extends Figure2 {
    private String figureName;

    public Triangle2(double dim1, double dim2) {
        super(dim1, dim2);
        figureName = "треугольник";
    }

    public double area() {
        System.out.println("Текущая фигура - " + figureName);
        return dim1 * dim2 / 2;
    }
}
