package oop;

public class CastingDemo1 {
    public static void main(String[] args) {
        Box6 box1 = new HeavyBox1();
        HeavyBox1 heavyBox1 = (HeavyBox1) box1;
        System.out.println(heavyBox1.weight);

        Box6 box2 = new ColorBox();
        heavyBox1 = (HeavyBox1) box2; //ClassCastException
    }
}
