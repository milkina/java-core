package oop;

public class Physics {
    public static final double ACCELERATION = 9.81;

    public static double potentialEnergy(double mass, double height) {
        return mass * height * ACCELERATION;
    }

    public static double getVelocity(double time) {
        return time * ACCELERATION;
    }

    public static double getDistance(double time) {
        return ACCELERATION * time * time / 2;
    }
}
