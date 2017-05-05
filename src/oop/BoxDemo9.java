package oop;

public class BoxDemo9 {
    public static void main(String args[]) {
        // declare, allocate, and initialize Box objects
        Box5 myBox1 = new Box5(10, 20, 15);

        System.out.println("Volume is " + myBox1.volume());

        myBox1 = null;
        System.gc();
    }
}
