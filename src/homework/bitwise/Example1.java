package homework.bitwise;

public class Example1 {
    public static void main(String[] args) {
        int a = 0xFF0;
        int b = 0xF0F;
        int c = 0x0FF;

        System.out.println(Integer.toBinaryString(a));

        c = a = (a ^ b | a & b) ^ c;

        System.out.println("a:" + Integer.toHexString(a));
        System.out.println("b:" + Integer.toHexString(b));
        System.out.println("c:" + Integer.toHexString(c));

        System.out.println((c | a) ^ (c & a));
    }
}
