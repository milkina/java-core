package oop;

public class AccessTest1 {
    public static void main(String args[]) {
        Test4 object = new Test4();

        // These are OK, a and b may be accessed directly
        object.a = 10;
        object.b = 20;

        // This is not OK and will cause an error
        // object.c = 100; // Error!

        // You must access c through its methods
        object.setC(100); // OK

        System.out.println("a, b, and c: " + object.a + " " +
                object.b + " " + object.getC());
    }
}
