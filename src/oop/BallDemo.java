package oop;

public class BallDemo {
    public static void main(String[] args) {
        Ball ball1 = new Ball("красный");
        Ball ball2 = new Ball("голубой");
        System.out.println("Количество созданных объектов: "
                + Ball.count);
    }
}
