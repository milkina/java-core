package interfaces;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIf obj1 = new MyIfImp();
        MyIf obj2 = new MyIfImp2();
        int defNum = MyIf.staticMethod();

        System.out.println(obj1.getNumber());
        System.out.println(obj1.defaultMethod());

        System.out.println(obj2.getNumber());
        System.out.println(obj2.defaultMethod());
        System.out.println(defNum);
    }
}
