package oop;

public class Box1 {
    double width;
    double height;
    double depth;

    // display volume of a box
    double volume() {
        return width * height * depth;
    }

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
