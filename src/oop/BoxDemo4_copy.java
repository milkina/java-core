package oop;

public class BoxDemo4_copy {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 1;
        myBox2.height = 5;
        myBox2.depth = 5;

        myBox1.getVolume();
        myBox2.getVolume();
    }
}
