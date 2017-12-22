package oop;

public class Box1 {
    double width;
    double height;
    double depth;

    // подсчитать объем коробки
    double getVolume() {
        return width * height * depth;
    }

    // установить размер коробки
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
