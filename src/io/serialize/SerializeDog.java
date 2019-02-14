package io.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDog {

    private static final String FILE_NAME = "testSer.ser";

    public static void main(String[] args) {
        Collar collar = new Collar(3);
        Dog dog1 = new Dog(collar);
        Dog dog2 = new Dog(collar);
        serialize(dog1, dog2);
        Dog[] deserializedDogs = deserialize(2);

        System.out.println(dog1.equals(deserializedDogs[0]));
        System.out.println(dog2.equals(deserializedDogs[1]));
        Collar desCollar1 = deserializedDogs[0].getCollar();
        Collar desCollar2 = deserializedDogs[1].getCollar();
        System.out.println(desCollar1.equals(desCollar2));
    }

    private static void serialize(Dog... dogs) {
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            for (Dog dog : dogs) {
                os.writeObject(dog);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Dog[] deserialize(int dogNumber) {
        Dog[] dogs = new Dog[dogNumber];
        try (FileInputStream fs = new FileInputStream(FILE_NAME);
             ObjectInputStream os = new ObjectInputStream(fs)) {
            for (int i = 0; i < dogNumber; i++) {
                dogs[i] = (Dog) os.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return dogs;
    }
}
