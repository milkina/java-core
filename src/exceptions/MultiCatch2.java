package exceptions;

public class MultiCatch2 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            int[] c = new int[a];
            c[a] = 6;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка." + e);
        }
        System.out.println("Уже после блока try-catch.");
    }
}
