package console;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // создаём объект класса Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        // возвращает истину если с потока ввода можно считать целое число
        if (sc.hasNextInt()) {
            // считывает целое число с потока ввода и сохраняем в переменную
            int i = sc.nextInt();
            System.out.println(i);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
