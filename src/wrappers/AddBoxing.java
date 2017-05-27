package wrappers;

public class AddBoxing {
    static void go(Integer x) {
        System.out.println("Integer");

    }

    static void go(long x) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        int i = 5;
        go(i); // which go() will be invoked?
    }
}
