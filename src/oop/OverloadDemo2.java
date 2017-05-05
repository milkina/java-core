package oop;

public class OverloadDemo2 {
    void test() {
        System.out.println("No parameters");
    }

    // Overload1 test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // overload test for a double parameter
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
