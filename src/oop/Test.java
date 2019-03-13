package oop;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    /**
     * Изменение объекта
     *
     * @param o
     */
    void changeObject(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    /**
     * Изменение примитивных типов
     *
     * @param a
     * @param b
     */
    void changePrimitives(int a, int b) {
        a *= 2;
        b /= 2;
    }
}
