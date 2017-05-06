package oop;

public class Ball {
    private static int count = 0;
    private String color = "none";

    public Ball(String color) {
        this.color = color;
        count++;
    }

    static int getCountInstance() {
        return count;
    }

    protected void finalize() {
        System.out.println("In finalize");
        count--;
    }
}

