package interfaces;

public class Transport implements Moveable {
    public void moveRight() {
        System.out.println("Transport moving right");
    }

    public void moveLeft() {
        System.out.println("Transport moving left");
    }

    public void stop() {
        System.out.println("Transport stopping");
    }

    public void start() {
        System.out.println("Transport starting");
    }
}
