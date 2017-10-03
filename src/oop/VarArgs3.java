package oop;

public class VarArgs3 {
    static void test(boolean... array) {
        System.out.println("test(boolean... array)");
        System.out.println("Количество аргументов: " + array.length);
        for (boolean a : array) {
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

    public static void main(String[] args) {
        //  test();// ошибка неоднозначности
        test(3);
        test(1, 2);
    }
}
