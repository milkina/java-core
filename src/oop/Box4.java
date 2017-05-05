package oop;

public class Box4 {
    double width;
    double height;
    double depth;

    // Constructor of class Box4
    Box4(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // display volume of a box
    double volume() {
        return width * height * depth;
    }
}
