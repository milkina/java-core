package oop;

public class Test4 {
    int a; // default access
    public int b; // public access
    private int c; // private access

    // methods to access c
    void setC(int i) { // set c's value
        c = i;
    }

    int getC() { // get c's value
        return c;
    }
}
