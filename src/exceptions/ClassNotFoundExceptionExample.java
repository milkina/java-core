package exceptions;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz0 = Integer.class;
        Class clazz1 = "Hello".getClass();
        Class clazz2 = Class.forName("com.lib.MyClass");
        //   User = clazz2.newInstance();
        //   com.lib.MyClass myClass = new MyClass();
    }
}
