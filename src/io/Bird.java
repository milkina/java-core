package io;

import java.io.Serializable;

public class Bird implements Serializable {
    private String name;
    private transient Ring ring;

    public Bird(String name, Ring ring) {
        this.name = name;
        this.ring = ring;
    }

    public Ring getRing() {
        return ring;
    }

   /* private void writeObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeInt(ring.getSize());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream is) {
        try {
            is.defaultReadObject();
            ring = new Ring(is.readInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
