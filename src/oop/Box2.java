package oop;

public class Box2 {
    double width;
    double height;
    double depth;

    Box2() {
        System.out.println("Koнcтpyиpoвaниe объекта Вох2");
        width = 10;
        height = 10;
        depth = 10;
    }

    // display volume of a box
    double volume() {
        return width * height * depth;
    }
}
