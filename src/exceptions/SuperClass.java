package exceptions;

import java.io.IOException;

public class SuperClass {
    public SuperClass()throws IOException {
    }

    public void start() throws Exception {
        throw new IOException("Not able to open file");
    }
}
