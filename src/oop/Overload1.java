package oop;

public class Overload1 {
    void test() {
        System.out.println("No parameters");
    }
    //illegal overloading method
   /* int test() {
        System.out.println("No parameters");
        return 1;
    }*/

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
