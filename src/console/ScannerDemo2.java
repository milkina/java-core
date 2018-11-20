package console;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // если ввести букву s,
        // то случится ошибка во время исполнения
        double i = sc.nextDouble();
        System.out.println(i);
    }
}
