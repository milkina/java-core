package interfaces;

/**
 * Created by Tatyana on 25.12.2017.
 */
public class StaticMethodDemo {
    public static void main(String[] args) {
        MyIf obj1 = new MyIfImp();

        System.out.println(obj1.getNumber());
        System.out.println(MyIf.staticMethod());
    }
}
