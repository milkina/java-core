package wrappers;

public class BoxOrVararg {
    public static void go(Byte x, Byte y) {
        System.out.println("Byte, Byte");
    }

    public static void go(byte... x) {
        System.out.println("byte... ");
    }

    public static void main(String[] args) {
        byte b = 5;
        go(b, b); // какой go() вызовется?
    }
}
