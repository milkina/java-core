package oop;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(2, 3, 4, 5, 5.3);

        System.out.println(shipment.cost);
        System.out.println(shipment.depth);
        System.out.println(shipment.height);
        System.out.println(shipment.weight);
        System.out.println(shipment.width);
    }
}
