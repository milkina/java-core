package io;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {
    public static void main(String[] args) {
        char[] in = new char[50];
        int size = 0;
        File file = new File("fileWrite.txt");
        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file);) {

            fw.write("Learn\nJava!\n");
            fw.flush();

            size = fr.read(in); // read the whole file!
            System.out.print(size + " "); // how many bytes read
            for (char c : in) {
                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
