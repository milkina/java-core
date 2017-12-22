package oop;

public class Box3 {
    double width;
    double height;
    double depth;

    // Конструктор класса Box3
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // подсчитать объем коробки
    double getVolume() {
        return width * height * depth;
    }
}
