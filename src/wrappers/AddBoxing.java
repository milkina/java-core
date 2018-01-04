package wrappers;

public class AddBoxing {
    public static void go(Integer x) {
        System.out.println("Integer");
    }

    public static void go(long x) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        int i = 5;
        go(i); // какой go() вызовется?
    }
}
