package oop;

public class Shipment extends HeavyBox1 {
    public double cost;

    public Shipment(int width, int height, int depth, int weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    public Shipment(double cost) {
        super();
        this.cost = cost;
    }
}
