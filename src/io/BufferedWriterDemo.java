package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\io\\buffWriter.txt"))) {
            String text = "Привет мир!";
            bw.write(text);
            bw.newLine();
            bw.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
