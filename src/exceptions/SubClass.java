package exceptions;

import java.io.IOException;

public class SubClass extends SuperClass {
    public SubClass() throws IOException,ArithmeticException {
        super();
    }

    public void start() throws IOException {
        //throw new Exception("Not able to start");
    }
}