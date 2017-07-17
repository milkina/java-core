package oop;

public class Circle {
    private int radius;
    private int diam;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        this.diam = radius * 2;
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam) {
        this.diam = diam;
        this.radius = diam / 2;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

    }
}
