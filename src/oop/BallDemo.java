package oop;

public class BallDemo {
    public static void main(String[] args) {
        Ball ball1 = new Ball("red");
        Ball ball2 = new Ball("blue");
        System.out.println(Ball.getCountInstance());
        System.out.println(ball1);
        System.out.println(ball2);
    }
}
