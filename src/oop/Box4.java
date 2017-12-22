package oop;

public class Box4 {
    double width;
    double height;
    double depth;

    // Конструктор класса Box4
    Box4(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // подсчитать объем коробки
    double getVolume() {
        return width * height * depth;
    }
}
