package exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            int[] c = new int[a];
            c[a] = 6;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль." + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Уже после блока try-catch-catch.");
    }
}
