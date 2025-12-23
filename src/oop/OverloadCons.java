package oop;

public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);

        System.out.println("Объем myBox1: " + myBox1.getVolume());
        System.out.println("Объем myBox2: " + myBox2.getVolume());
        System.out.println("Объем myBox3: " + myBox3.getVolume());
    }
}

