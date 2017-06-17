package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeBird {
    public static void main(String[] args) {
        Ring ring = new Ring(3);
        Bird bird = new Bird("pigeon", ring);
        System.out.println("Ring size before serialization: " + bird.getRing().getSize());
        try {
            FileOutputStream fs = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(bird);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            bird = (Bird) ois.readObject(); // 4
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Ring size after serialization: " + bird.getRing().getSize());
    }
}
