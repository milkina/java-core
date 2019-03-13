package operations;

public class Bitwise1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = ~b;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("publicVar = " + Integer.toBinaryString(b));
        System.out.println("a | publicVar = " + Integer.toBinaryString(c));
        System.out.println("a & publicVar = " + Integer.toBinaryString(d));
        System.out.println("a ^ publicVar = " + Integer.toBinaryString(e));
        System.out.println("~ publicVar = " + Integer.toBinaryString(f));
    }
}
