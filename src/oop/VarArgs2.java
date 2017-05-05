package oop;

public class VarArgs2 {
    static void test(double... array) {
        System.out.println("test(double... array)");
        System.out.println("Количество аргументов: " + array.length);
        for (double a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void test(int... array) {
        System.out.println("test(int... array)");
        System.out.println("Количество аргументов: " + array.length);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void test(int a) {
        System.out.println("test(int a)");
    }

    static void test(String str, double... array) {
        System.out.println("String str, double... array");
        System.out.println("Количество аргументов: " + array.length);
        for (double a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test();
        test(3);
        test(1.0);
        test(1, 2);
        test("Проверка", 1, 2);
    }
}
