package oop;

public class TestDemo {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        int x = 10;
        int y = 10;
        System.out.println("x и y перед вызовом: " + x + " " + y);
        ob.changePrimitives(x, y);
        System.out.println("x и y после вызова: " + x + " " + y);

        System.out.println("ob.defaultVar и ob.publicVar перед вызовом: " + ob.a + " " + ob.b);
        ob.changeObject(ob);
        System.out.println("ob.defaultVar и ob.publicVar после вызова: " + ob.a + " " + ob.b);
    }
}
