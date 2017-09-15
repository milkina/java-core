package oop;

public class CastingDemo2 {
    public static void main(String[] args) {
        Box6 box1 = new HeavyBox1();
        if (box1 instanceof HeavyBox1) {
            HeavyBox1 heavyBox = (HeavyBox1) box1;
            System.out.println("Приведение 1");
        }

        Box6 box2 = new ColorBox();
        if (box2 instanceof HeavyBox1) {
            HeavyBox1 heavyBox1 = (HeavyBox1) box2;
            System.out.println("Приведение 2");
        }

        Box6 box3 = new Box6();
        if (box3 instanceof HeavyBox1) {
            HeavyBox1 heavyBox1 = (HeavyBox1) box3;
            System.out.println("Приведение 3");
        }
    }
}
