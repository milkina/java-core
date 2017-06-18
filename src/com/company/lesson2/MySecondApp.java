package com.company.lesson2;

public class MySecondApp {
    public static void main(String[] args) {
        int count = 0;
        for (String str : args) {
            System.out.println(count++ + " аргумент = " + str);
        }
    }
}
