package oop;

/**
 * Created by Tatyana on 12.01.2018.
 */
public class BoxDemo8 {
    public static void main(String[] args) {
        Box5 myBox = new Box5(10, 20, 15);
        System.out.println("Объем: " + myBox.getVolume());
        myBox = null;
        System.gc();
    }
}
