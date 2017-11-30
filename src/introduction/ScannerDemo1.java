package introduction;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // создаём объект класса Scanner
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.print("Введите целое число: ");
        // возвращает истину если с потока ввода можно считать целое число
        if (scanner.hasNextInt()) {
            // считывает целое число с потока ввода и сохраняем в переменную
            i = scanner.nextInt();
            System.out.println(i);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
