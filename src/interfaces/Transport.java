package interfaces;

public class Transport implements Moveable {
    public void moveRight() {
        System.out.println("Транспорт поворачивает вправо.");
    }

    public void moveLeft() {
        System.out.println("Транспорт поворачивает влево.");
    }

    public void stop() {
        System.out.println("Транспорт останавливается.");
    }

    public void start() {
        System.out.println("Транспорт стартует.");
    }
}
