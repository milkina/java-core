package oop;

public class BoxDemo6 {
    public static void main(String args[]) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();

        myBox1.setDim(10, 20, 15);
        myBox1.setDim(1, 5, 5);

        System.out.println("Volume is " + myBox1.volume());
        System.out.println("Volume is " + myBox2.volume());
    }
}
