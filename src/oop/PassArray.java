package oop;

public class PassArray {
    static void test(int array[]) {
        System.out.println("Количество аргументов: " + array.length);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test(new int[]{});
        test(new int[]{1});
        test(new int[]{1, 3});
    }
}
