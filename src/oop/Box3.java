package oop;

public class Box3 {
    double width;
    double height;
    double depth;

    // Constructor of class Box3
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // display volume of a box
    double volume() {
        return width * height * depth;
    }
}
