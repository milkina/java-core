package oop;

public class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test2 o) {
        o.a *= 2;
        o.b /= 2;
    }

    // pass an int
    void meth(int a, int b) {
        a *= 2;
        b /= 2;
    }
}
