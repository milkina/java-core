package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDog {
    public static void main(String[] args) {
        Collar c = new Collar(3);
        Dog d = new Dog(c, 8);
        try {
            FileOutputStream fs = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(d);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
