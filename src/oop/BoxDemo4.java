package oop;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box3 myBox1 = new Box3(10, 20, 15);
        Box3 myBox2 = new Box3(3, 6, 9);
        //Не можем использовать конструктор по умолчанию
        //Box3 myBox3 = new Box3();

        System.out.println("Объем: " + myBox1.getVolume());
        System.out.println("Объем: " + myBox2.getVolume());
    }
}
