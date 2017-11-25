package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try {
            char[] c = {'a', 'b', 'c'};
            // Создание текстового файла
            OutputStream output = new FileOutputStream("a.txt");
            for (int i = 0; i < c.length; i++) {
                // Запись каждого символа в текстовый файл
                output.write(c[i]);
            }
            output.close();

            InputStream input = new FileInputStream("a.txt");
            int size = input.available();

            for (int j = 0; j < size; j++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
            input.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
