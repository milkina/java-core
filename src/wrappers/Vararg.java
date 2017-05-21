package wrappers;

public class Vararg {
    static void wide_vararg(long... x) {
        System.out.println("long...");
    }

    static void box_vararg(Integer... x) {
        System.out.println("Integer...");
    }

    public static void main(String[] args) {
        int i = 5;
        wide_vararg(i, i); // needs to widen and use var-args
        box_vararg(i, i); // needs to box and use var-args
    }
}
