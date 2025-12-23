package casting;

import oop.Box;

import java.io.Serializable;

public class ArrayCastingDemo4 {
    public static void main(String[] args) {
        Box[] array = new Box[5];
        Object object = array;
        Cloneable cloneable = array;
        Serializable serializable = array;
    }
}
