package io;

import java.util.Scanner;

public class ScannerDelimiterExample {
    public static void main(String[] args) {
        double sum = 0.0, number;
        Scanner scanner = new Scanner("1,3;2,0; 8,5; 4,8; 9,0; 1; 10; abc");
        scanner.useDelimiter(";\\s*");
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                System.out.println("Число:" + number);
                sum += number;
            } else {
                System.out.println("Строка: " + scanner.next());
            }
        }
        System.out.println("Сумма чисел = " + sum);
    }
}
