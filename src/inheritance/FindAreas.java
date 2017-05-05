package inheritance;

public class FindAreas {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Figure(10, 10);
        figures[1] = new Rectangle(10, 10);
        figures[2] = new Triangle(10, 10);
        for (Figure figure : figures) {
            figure.area();
        }
    }
}
