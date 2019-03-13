package oop;

public class Overloading1 {
    void test(int a) {
        System.out.println("defaultVar: " + a);
    }

    void test(int a, int b) {
        System.out.println("defaultVar и publicVar: " + a + " " + b);
    }

    public static void main(String[] args) {
        Overloading1 ob = new Overloading1();

        ob.test(10);
        ob.test(10, 20);
    }
}
