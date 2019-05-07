package oop;

public class Overloading2 {
    void test() {
        System.out.println("Без параметров");
    }
    //неправильная перегрузка методов
   /* int test() {
        System.out.println("Без параметров");
        return 1;
    }*/

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

    public static void main(String[] args) {
        Overloading2 ob = new Overloading2();

        ob.test();
        double result = ob.test(123.25);
        System.out.println("Результат вызова метода ob.test(123.25): " + result);
    }
}
