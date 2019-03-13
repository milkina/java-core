package oop;

public class OverloadCons {
    public static void main(String[] args) {
        Box6 myBox1 = new Box6(10, 20, 15);
        Box6 myBox2 = new Box6();
        Box6 myBox3 = new Box6(7);

        System.out.println("Объем myBox1: " + myBox1.getVolume());
        System.out.println("Объем myBox2: " + myBox2.getVolume());
        System.out.println("Объем myBox3: " + myBox3.getVolume());
    }
}

