package interfaces;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        SomeInterface obj1 = new SomeInterfaceImpl1();
        SomeInterface obj2 = new SomeInterfaceImpl2();

        System.out.println(obj1.defaultMethod());
        System.out.println(obj2.defaultMethod());
    }
}
