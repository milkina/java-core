package oop;

public class DifferentBoxDemo2 {
    public static void main(String[] args) {
        Box6 box = new Box6(15, 10, 25);
        Box6 heavyBox = new HeavyBox(15, 10, 20, 5);
        Box6 colorBox = new ColorBox(25, 12, 20, "красный");

        System.out.println("Объём коробки: " + box.getVolume());
        System.out.println("Объём коробки: " + heavyBox.getVolume());
        System.out.println("Объём коробки: " + colorBox.getVolume());
        //System.out.println(" Вес коробки: " + heavyBox.weight);
        //System.out.println(" Цвет коробки: " + colorBox.color);
    }
}
