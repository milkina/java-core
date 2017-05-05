package oop;

public class Box5 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box5(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    protected void finalize() {
        System.out.println("Goodbye box");
    }
}
