package casting;

import oop.Box6;

import java.io.Serializable;

public class ArrayCastingDemo4 {
    public static void main(String[] args) {
        Box6[] array = new Box6[5];
        Object object = array;
        Cloneable cloneable = array;
        Serializable serializable = array;
    }
}
