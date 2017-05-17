package oop;

/**
 * В этом примере класс Вох определяет три конструктора для инициализации размеров параллелепипеда различными способами.
 */

public class Box6 {
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    Box6(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    public Box6() {
        width = -1;  // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1;  // box
    }

    // constructor used when cube is created
    Box6(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
