package interfaces;

public class TransportDemo {
    public static void main(String[] args) {
        Moveable moveable = new Transport();
        Transport transport = new Transport();
        Moveable robot = new Robot();
        //Moveable moveable1 =new Moveable();

        //  moveable.start();
        moveable.moveRight();
        moveable.moveLeft();
        System.out.println();

        transport.start();
        transport.moveRight();
        transport.moveLeft();
        transport.stop();
        System.out.println();

        robot.moveLeft();
        robot.moveRight();
    }
}
