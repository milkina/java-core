package oop;

public class PassObjReference {
    public static void main(String args[]) {
        Test2 ob = new Test2(15, 20);

        int x = 10;
        int y = 10;
        System.out.println("x and y before call: " + x + " " + y);
        ob.meth(x, y);
        System.out.println("x and y after call: " + x + " " + y);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
