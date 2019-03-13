package oop;

public class Box3 {
    double width;
    double height;
    double depth;

    /**
     * Конструктор класса Box3
     *
     * @param w - щирина
     * @param h - высота
     * @param d - глубина
     */
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    /**
     * Подсчитать объем коробки
     *
     * @return объем
     */
    double getVolume() {
        return width * height * depth;
    }
}
