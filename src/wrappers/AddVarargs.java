package wrappers;

public class AddVarargs {
    public static void go(int x, int y) {
        System.out.println("int,int");
    }

    public static void go(byte... x) {
        System.out.println("byte... ");
    }

    public static void main(String[] args) {
        byte b = 5;
        go(b, b); // какой go() вызовется?
    }
}
