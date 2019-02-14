package io.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeCat {
    private static final String FILE_NAME = "testSer.ser";

    public static void main(String[] args) {
        Cat c = new Cat("Барсик");
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(c);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            c = (Cat) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
