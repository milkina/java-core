package lesson2;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        System.out.println(s1 + s2);
    }
}
