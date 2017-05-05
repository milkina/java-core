package oop;

public class OverloadDemo1 {
    void test() {
        System.out.println("No parameters");
    }
    //illegal overloading method
   /* int test() {
        System.out.println("No parameters");
        return 1;
    }*/

    // Overload1 test for one integer parameter.
    void test(int a) {
        System.out.println("a: " + a);
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
