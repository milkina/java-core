package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String args[]) throws IOException {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream("src\\io\\file.txt");
            fileOut = new FileOutputStream("src\\io\\copied_file.txt");

            int a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a); // Чтение содержимого файла file.txt и запись в файл copied_file.txt
            }
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}
