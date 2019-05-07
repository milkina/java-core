package operations;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 1;
        int b = a++;
        int c = ++a;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
