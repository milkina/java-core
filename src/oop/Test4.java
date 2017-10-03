package oop;

public class Test4 {
    public int b; // public access
    private int c; // private access
    int a; // default access

    // methods to access c
    void setC(int i) { // set c's value
        c = i;
    }

    int getC() { // get c's value
        return c;
    }

    @Override
    public String toString() {
        return "Test4{" +
                "b=" + b +
                ", c=" + c +
                ", a=" + a +
                '}';
    }
}
