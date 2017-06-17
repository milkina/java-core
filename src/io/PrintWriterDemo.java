package io;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        String s1 = "Привет мир!";
        String s2 = "Hello World!";
        try (PrintWriter printWriter = new PrintWriter("notes.txt")) {
            printWriter.println(s1);
            int i = 2;
            printWriter.printf("Квадрат числа %d равен %d \n", i, i * i);
            printWriter.write(s2);
            printWriter.print("Конец");
            System.out.println("Запись в файл произведена");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
