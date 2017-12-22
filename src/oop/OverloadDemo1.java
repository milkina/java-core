package oop;

public class OverloadDemo1 {
    public static void main(String[] args) {
        Overload1 ob = new Overload1();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}
