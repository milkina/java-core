package oop;

import inheritance.SomeClass;

/**
 * В этом примере класс Вох определяет три конструктора для инициализации
 * размеров коробки различными способами.
 */

public class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(SomeClass s1, SomeClass s2) {

    }

    public Box() {
        width = -1;  // используем -1 для
        height = -1; // обозначения непроинициализированной
        depth = -1;  // коробки
    }

    Box(double len) {
        width = len;
        height = len;
        depth = len;
    }

    double getVolume() {
        return width * height * depth;
    }
}
