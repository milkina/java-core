package oop;

import java.util.Scanner;

public class StaticBlock {
    static String a;

    static {
        System.out.println("Статический блок инициализирован.");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("a = " + a);
    }
}
