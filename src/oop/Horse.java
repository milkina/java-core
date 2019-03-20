package oop;

public class Horse extends Animal {
    private Halter halter;

    public Horse(Halter halter) {
        this.halter = halter;
    }

    public Horse() {
        this.halter = new Halter();
    }
}
