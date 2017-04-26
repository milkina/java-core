package console;

import java.util.Scanner;

public class ScannerDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 2 целыx числа: ");
        getIntValue(sc);
        getIntValue(sc);
    }

    private static void getIntValue(Scanner sc) {
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println("Целое число " + i);
        } else {
            System.out.println(sc.next() + " не целое число");
        }
    }
}
