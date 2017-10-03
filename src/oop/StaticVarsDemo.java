package oop;

/**
 * Created by Tatyana on 03.10.2017.
 */
public class StaticVarsDemo {
    public static void main(String[] args) {
        StaticVars staticVars1 = new StaticVars();
        StaticVars staticVars2 = new StaticVars();

        System.out.println(staticVars1.a);
        System.out.println(StaticVars.b);
        System.out.println(staticVars1.b);

        staticVars1.b = 3;
        staticVars2.b = 4;

        System.out.println(staticVars1.b);
        System.out.println(staticVars2.b);
    }
}
