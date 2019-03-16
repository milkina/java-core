package oop;

public class PhysicsMagicNumber {
    public static double potentialEnergy(double mass, double height) {
        return mass * height * 9.81;
    }

    public static double getVelocity(double time) {
        return time * 9.81;
    }

    public static double getDistance(double time) {
        return 9.81 * time * time / 2;
    }
}
