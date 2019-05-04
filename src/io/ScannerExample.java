package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
    private static String fileName = "scan.txt";

    public static void scanFile() {
        try (FileReader fileReader = new FileReader(fileName);
             Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    System.out.println(scanner.nextInt() + " :int");
                } else if (scanner.hasNextDouble()) {
                    System.out.println(scanner.nextDouble() + " :double");
                } else if (scanner.hasNextBoolean()) {
                    System.out.println(scanner.nextBoolean() + " :boolean");
                } else {
                    System.out.println(scanner.next() + " :String");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void makeFile() {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write("2 Java 1,5 true 1.6 ");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ScannerExample.makeFile();
        ScannerExample.scanFile();
    }
}



