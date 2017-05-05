package oop;

public class BoxDemo2 {
    public static void main(String args[]) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();
        double volume;
        // присвоить значения переменным экземпляра myBox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        //присвоить другие значения переменным экземпляра myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;
        // рассчитать объем первого параллелепипеда
        volume = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Oбъeм равен " + volume);
        // рассчитать объем второго параллелепипеда
        volume = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println(" Oбъeм равен " + volume);
    }
}
