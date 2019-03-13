package oop;

public class ModificatorsDemo1 {
    public static void main(String[] args) {
        Modificators object = new Modificators();

        object.defaultVar = 10;
        object.publicVar = 20;
        //object.privateVar = 100; // Ошибка компиляции!
    }
}
