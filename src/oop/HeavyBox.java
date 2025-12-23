package oop;

import inheritance.SomeClass;

public class HeavyBox extends Box {
    private int weight;

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
      //  width *= 2;
      //  height *= 2;
       // depth *= 2;
        super(width, height, depth);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(3, 4, 5, 6);
    }
}
