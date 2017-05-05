package oop;

public class HeavyBox1 extends Box6 {
    int weight; // вес коробки

    public HeavyBox1(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public HeavyBox1() {
        super();
        this.weight = -1;
    }
}
