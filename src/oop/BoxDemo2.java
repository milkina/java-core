package oop;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();

        myBox1.setDim(10, 20, 15);
        myBox1.setDim(1, 5, 5);

        System.out.println("Объем: " + myBox1.getVolume());
        System.out.println("Объем: " + myBox2.getVolume());
    }
}
