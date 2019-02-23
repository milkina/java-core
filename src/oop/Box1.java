package oop;

public class Box1 {
    double width;
    double height;
    double depth;

    /**
     * Подсчитать объем коробки
     *
     * @return Объем
     */
    double getVolume() {
        return width * height * depth;
    }

    /**
     * Установить размер коробки
     *
     * @param w - ширина
     * @param h - высота
     * @param d - глубина
     */
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
