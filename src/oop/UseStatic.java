package oop;

public class UseStatic {
    static int a = 3;
    static int b;
    int c;

    public void nonStaticMethod() {
        System.out.println("Нестатический метод");
    }

    static {
        System.out.println("Статический блок инициализирован.");
        b = a * 4;
    }

    static void method(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //System.out.println("c = " + c); cannot access non-static member
    }

    public static void main(String[] args) {
        method(42);
        //nonStaticMethod();cannot access non-static member
        UseStatic useStatic = new UseStatic();
        useStatic.nonStaticMethod();
        System.out.println("c = " + useStatic.c);
        useStatic.method(67);
    }
}
