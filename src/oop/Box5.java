package oop;

public class Box5 {
    double width;
    double height;
    double depth;

    // Конструктор класса Box5
    Box5(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // подсчитать объем коробки
    double getVolume() {
        return width * height * depth;
    }

    protected void finalize() {
        System.out.println("Коробка исчезает навсегда.");
    }
}
