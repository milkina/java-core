package generics;

public class GenConstructorDemo {
    public static void main(String[] args) {
        GenConstructor genConstructor1 = new GenConstructor(100);
        GenConstructor genConstructor2 = new GenConstructor(123.5F);

        genConstructor1.showValue();
        genConstructor2.showValue();
    }
}
