package oop;

import static oop.StaticMethodClass.staticMethod;
import static oop.StaticMethodClass.staticVar;

public class StaticImport {
    public static void main(String[] args) {
        staticMethod(42);
        System.out.println(staticVar);
    }
}
