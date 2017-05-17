package casting;

import interfaces.Moveable;
import interfaces.Robot;
import interfaces.Transport;

public class CastingDemo3 {
    public static void main(String[] args) {
        Moveable moveable1 = new Transport();
        if (moveable1 instanceof Transport) {
            Transport transport = (Transport) moveable1;
            transport.start();
        }

        Moveable moveable2 = new Robot();
        if (moveable2 instanceof Transport) {
            Transport transport = (Transport) moveable1;
            transport.stop();
        }
    }
}
