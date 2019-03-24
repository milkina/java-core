package wrappers;

public class AutoBoxAndMethods {
    static int someMethod(Integer value) {
        return value;
    }

    public static void main(String[] args) {
        Integer iOb = someMethod(100);
        System.out.println(iOb);
    }
}
