package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) throws IOException {
        readFirstLineFromFileWithFinallyBlock("a.txt");
    }

    public static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            if (br != null) br.close();
        }
    }

    public static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public static String readFirstLineFromFile2(String path) throws IOException {
        try (FileReader f = new FileReader("a.txt");
             BufferedReader br = new BufferedReader(f)) {
            return br.readLine();
        }
    }
}
