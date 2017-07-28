package wrappers;

public class VarargConversion {
    static void wideVararg(long... x) {
        System.out.println("long...");
    }

    static void boxVararg(Integer... x) {
        System.out.println("Integer...");
    }

    public static void main(String[] args) {
        int i = 5;
        wideVararg(i, i); // needs to widen and use var-args
        boxVararg(i, i); // needs to box and use var-args
    }
}
