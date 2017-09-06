package lesson2;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextDouble(); // если ввести букву s, то случится ошибка во время исполнения
        System.out.println(i);
    }
}
