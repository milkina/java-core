package operations;

public class BooleanLogic5 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = true;
        b1 &= b2;//равносильно b1 = b1 & b2;
        System.out.println(b1);
        b1 |= b2; //равносильно b1 = b1 | b2;
        System.out.println(b1);
        b1 ^= b2; //равносильно b1 = b1 ^ b2;
        System.out.println(b1);
    }
}
