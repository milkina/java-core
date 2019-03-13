package oop;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setDiam(25);
        circle.setRadius(10);

        System.out.println(circle.getDiam());
        System.out.println(circle.getRadius());
    }
}
