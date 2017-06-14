package exceptions;

public class NestTry2 {
    public static void main(String args[]) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            doSomeJob(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }

    public static void doSomeJob(int a) {
        try {
            if (a == 1)
                a = a / (a - a);
            if (a == 2) {
                int с[] = {1};
                с[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс выходит за границу массива: " + e);
        }
    }
}
