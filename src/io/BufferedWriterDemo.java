package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\io\\buffWriter.txt"))) {
            String text = "Привет мир!";
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.write(text);
            bufferedWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
