package oop;

public class Overload1 {
    public static void main(String args[]) {
        OverloadDemo1 ob = new OverloadDemo1();
        double result;

        // call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}
