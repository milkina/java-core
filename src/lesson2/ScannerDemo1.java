package lesson2;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаём объект класса Scanner
        int i;
        System.out.print("Введите целое число: ");
        if (scanner.hasNextInt()) { // возвращает истину если с потока ввода можно считать целое число
            i = scanner.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.println(i);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
