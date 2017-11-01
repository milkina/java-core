package oop;

public class ClassDemo1 {
    public static void main(String[] args) {
        getClassName1();
        getClassName2();
        getClassName3();
    }

    private static void getClassName1() {
        String s = "Это строка";
        Class aClass = s.getClass();
        System.out.println(aClass);
    }

    private static void getClassName2() {
        try {
            Class aClass = Class.forName("java.lang.String");
            System.out.println(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getClassName3() {
        Class aClass = String.class;
        System.out.println(aClass);
    }
}
