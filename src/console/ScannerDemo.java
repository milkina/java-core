package console;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i;
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) { // возвращает истину если с потока ввода можно считать целое число
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.println(i * 2);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
