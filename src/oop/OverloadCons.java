package oop;

public class OverloadCons {
    public static void main(String args[]) {
        // create boxes using the various constructors
        Box6 myBox1 = new Box6(10, 20, 15);
        Box6 myBox2 = new Box6();
        Box6 myCube = new Box6(7);

        double vol;

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        // get volume of cube
        vol = myCube.volume();
        System.out.println("Volume of myCube is " + vol);
    }
}

