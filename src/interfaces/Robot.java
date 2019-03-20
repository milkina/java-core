package interfaces;

public class Robot implements Moveable {
    public void moveRight() {
        System.out.println("Робот поворачивает вправо.");
    }

    public void moveLeft() {
        System.out.println("Робот поворачивает влево.");
    }
}
