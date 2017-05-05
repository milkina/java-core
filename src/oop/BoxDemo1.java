package oop;

public class BoxDemo1 {
    public static void main(String args[]) {
        Box1 myBox = new Box1();
        // присвоить значение переменным экземпляра mybox
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        // рассчитать объем параллелепипеда
        double volume = myBox.width * myBox.height * myBox.depth;
        System.out.println("Oбъeм равен " + volume);
    }
}
