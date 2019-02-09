package io.serialize;

import java.io.Serializable;

public class Collar implements Serializable {
    private int collarSize;

    public Collar(int size) {
        collarSize = size;
    }

    public int getCollarSize() {
        return collarSize;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Collar collar = (Collar) o;
        return getCollarSize() == collar.getCollarSize();
    }

    @Override
    public int hashCode() {
        return getCollarSize();
    }
}
