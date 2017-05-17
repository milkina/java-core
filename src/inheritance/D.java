package inheritance;

public class D extends C {
    public String i;

    public D(String a, int b) {
        i = a;
        super.i = b;
    }

    public void print(String str) {
        System.out.println(str);
        System.out.println("i = " + i);
        System.out.println("super.i = " + super.i);
    }

    public void print() {
        System.out.println("D.i = " + i);
        super.print();
    }
}
