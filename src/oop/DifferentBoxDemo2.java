package oop;

public class DifferentBoxDemo2 {
    public static void main(String[] args) {
        Box6 box = new Box6(15, 10, 25);
        Box6 heavyBox = new HeavyBox(15, 10, 20, 5);
        Box6 colorBox = new ColorBox(25, 12, 20, "красный");

        System.out.println("Объём коробки: " + box.volume());
        System.out.println("Объём коробки: " + heavyBox.volume());
        System.out.println("Объём коробки: " + colorBox.volume());
        // System.out.println("Объём коробки: " + heavyBox.volume() + " Вес коробки: " + heavyBox.weight);
        // System.out.println("Объём коробки: " + colorBox.volume() + " Цвет коробки: " + colorBox.color);
    }
}
