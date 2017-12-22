package oop;

public class OverloadCons {
    public static void main(String[] args) {
        Box6 myBox1 = new Box6(10, 20, 15);
        Box6 myBox2 = new Box6();
        Box6 myCube = new Box6(7);

        double vol;

        vol = myBox1.getVolume();
        System.out.println("Объем myBox1: " + vol);

        vol = myBox2.getVolume();
        System.out.println("Объем myBox2: " + vol);

        vol = myCube.getVolume();
        System.out.println("Объем myCube: " + vol);
    }
}

