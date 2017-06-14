package exceptions;

import java.io.IOException;

public class ExceptionLossTest {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception("a");
            } finally {
                if (true) {
                    throw new IOException("b");
                }
                System.out.println("c");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("d");
            System.out.println(ex.getMessage());
        }
    }
}
