package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeCat {
    public static void main(String[] args) {
        Cat c = new Cat("Барсик");
        try (FileOutputStream fs = new FileOutputStream("testSer.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream("testSer.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            c = (Cat) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
