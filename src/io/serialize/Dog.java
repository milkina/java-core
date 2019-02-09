package io.serialize;

import java.io.Serializable;

public class Dog implements Serializable {
    private Collar theCollar;

    public Dog(Collar collar) {
        theCollar = collar;
    }

    public Collar getCollar() {
        return theCollar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Dog dog = (Dog) o;

        return theCollar != null
                ? theCollar.equals(dog.theCollar) : dog.theCollar == null;

    }

    @Override
    public int hashCode() {
        return theCollar != null ? theCollar.hashCode() : 0;
    }
}
