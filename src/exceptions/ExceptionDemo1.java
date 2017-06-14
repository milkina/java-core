package exceptions;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        subRoutine();
    }

    public static void subRoutine() {
        int d = 0;
        int a = 10 / d;
    }
}
