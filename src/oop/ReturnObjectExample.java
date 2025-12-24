package oop;

public class ReturnObjectExample {
    int a;

    ReturnObjectExample(int i) {
        a = i;
    }

    ReturnObjectExample incrementByTen() {
        ReturnObjectExample temp = new ReturnObjectExample(a + 10);
        return temp;
    }

    public static void main(String[] args) {
        ReturnObjectExample ob1 = new ReturnObjectExample(2);
        ReturnObjectExample ob2 = ob1.incrementByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
    }
}
