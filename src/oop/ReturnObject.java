package oop;

public class ReturnObject {
    public static void main(String args[]) {
        Test3 ob1 = new Test3(2);
        Test3 ob2;

        ob2 = ob1.incrementByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrementByTen();
        System.out.println("ob2.a after second increase: "
                + ob2.a);
    }
}
