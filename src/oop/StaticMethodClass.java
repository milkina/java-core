package oop;

public class StaticMethodClass {
    static int staticVar = 3;
    int nonStaticVar;

    public void nonStaticMethod() {
        System.out.println("Нестатический метод");
    }

    static void staticMethod(int localVar) {
        System.out.println("localVar = " + localVar);
        System.out.println("staticVar = " + staticVar);
        //Нельзя обратиться к нестатической переменной из статического метода
        //System.out.println("nonStaticVar = " + nonStaticVar);
    }

    public static void main(String[] args) {
        staticMethod(42);
        //Нельзя обратиться к нестатическому методу без указания объекта
        //nonStaticMethod();
        StaticMethodClass useStatic = new StaticMethodClass();
        useStatic.nonStaticMethod();
        useStatic.staticMethod(67);
    }
}
