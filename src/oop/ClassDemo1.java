package oop;

public class ClassDemo1 {
    public static void main(String[] args) {
        getClassName1();
        getClassName2();
        getClassName3();
    }

    private static void getClassName3() {
        Class c3 = String.class;
        System.out.println(c3);
    }

    private static void getClassName2() {
        try {
            Class c2 = Class.forName("java.lang.String");
            System.out.println(c2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getClassName1() {
        String s = "Это строка";
        Class c1 = s.getClass();
        System.out.println(c1);
    }
}
