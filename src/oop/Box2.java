package oop;

public class Box2 {
    double width;
    double height;
    double depth;

    Box2() {
        System.out.println("Конструирование объекта Вох2");
        width = 10;
        height = 10;
        depth = 10;
    }

    // подсчитать объем коробки
    double getVolume() {
        return width * height * depth;
    }
}
