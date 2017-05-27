package generics;

public class GenConstructorDemo {
    public static void main(String args[]) {
        GenConstructor test1 = new GenConstructor(100);
        GenConstructor test2 = new GenConstructor(123.5F);

        test1.showValue();
        test2.showValue();
    }
}
