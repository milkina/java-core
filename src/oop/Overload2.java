package oop;

public class Overload2 {
    public static void main(String args[]) {
        OverloadDemo2 ob = new OverloadDemo2();
        double result;
        int i = 88;

        // call all versions of test()
        ob.test();
        ob.test(i);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}
