package operations;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 1;
        int b = a++;
        int c = ++a;
        c++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
