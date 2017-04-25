package operations;

public class Bitwise3 {
    public static void main(String[] args) {
        int a = 560;
        int maska = 67;
        int b = a ^ maska;
        int c = b ^ maska;
        System.out.println("a = " + a);
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + b);
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("c = " + c);
        System.out.println("c = " + Integer.toBinaryString(c));
    }
}
