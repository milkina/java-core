package operations;

public class CompoundOperations {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a += 3;
        b *= 2;
        c += a * b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

