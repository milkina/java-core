package oop;

import inheritance.SomeClass;

public class HeavyBox1 extends Box {
    public int weight;

    public HeavyBox1(int width, int height, int depth, int weight) {
        width *= 2;
        height *= 2;
        depth *= 2;
        super(width, height, depth);
        this.weight = weight;
    }

    public HeavyBox1() {
        SomeClass s = new SomeClass();
        super(s, s);
        this.weight = -1;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        HeavyBox1 heavyBox1 = new HeavyBox1(3, 4, 5, 6);
    }
}
