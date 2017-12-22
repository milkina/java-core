package oop;

public class OverloadDemo2 {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();
        double result;
        int i = 88;

        ob.test();
        ob.test(i);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}
