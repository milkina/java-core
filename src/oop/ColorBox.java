package oop;

public class ColorBox extends Box6 {
    String color; // цвет коробки

    public ColorBox(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color; // цвет
    }

    public ColorBox() {
    }
}
