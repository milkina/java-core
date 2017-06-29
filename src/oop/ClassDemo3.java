package oop;

import java.util.Arrays;

public class ClassDemo3 {
    public static void main(String[] args) {
        Class heavyBoxClass = HeavyBox1.class;
        System.out.println(heavyBoxClass.getClass());
        System.out.println(Arrays.toString(heavyBoxClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(heavyBoxClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(heavyBoxClass.getDeclaredFields()));
    }
}
