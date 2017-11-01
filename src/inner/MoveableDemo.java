package inner;

import interfaces.Moveable;

/**
 * Created by Tatyana on 31.10.2017.
 */
public class MoveableDemo {
    public static void main(String[] args) {
        Moveable moveable = new Moveable() {
            @Override
            public void moveRight() {
                System.out.println("MOVING RIGHT!!!");
            }

            @Override
            public void moveLeft() {
                System.out.println("MOVING LEFT!!!");
            }
        };
        moveable.moveRight();
        moveable.moveLeft();
    }
}
