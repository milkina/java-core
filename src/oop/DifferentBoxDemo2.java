package oop;

public class DifferentBoxDemo2 {
    public static void main(String[] args) {
        Box box = new Box(15, 10, 25);
        Box heavyBox = new HeavyBox(15, 10, 20, 5);
        Box redBox = new ColorBox(25, 12, 20, "красный");

        ColorBox blueBox = new ColorBox(25, 12, 20, "голубой");

        System.out.println("Ширина коробки: " + box.width);
        System.out.println("Ширина тяжелой коробки: " + heavyBox.width);
        System.out.println("Ширина красной коробки: " + redBox.width);
        System.out.println("Ширина голубой коробки: " + blueBox.width);

        System.out.println("Цвет голубой коробки: " + blueBox.color);
        //System.out.println("Цвет красной коробки: " + redBox.color);
        //System.out.println("Вес тяжелой коробки: " + heavyBox.weight);
    }
}
