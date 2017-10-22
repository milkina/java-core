package inheritance;

abstract public class Figure2 {
    private String figureName;
    double dim1;
    double dim2;

    public Figure2(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public String getFigureName() {
        return figureName;
    }

    abstract public double area();
}
