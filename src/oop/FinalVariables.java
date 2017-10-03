package oop;

public class FinalVariables {
    public static final int FILE_NEW = 1;
    public final String SOME_STRING = "something";

    public static void print(final double d) {
        //  FILE_NEW = 2;
        final String str;
        str = "someString";
        //  str ="";
        //  d=4;
        System.out.println("FILE_NEW = " + FILE_NEW);
        System.out.println("str = " + str);
        System.out.println("d = " + d);
    }

    public static void main(String[] args) {
        print(3);
    }
}
