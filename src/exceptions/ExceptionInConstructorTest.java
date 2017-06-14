package exceptions;

public class ExceptionInConstructorTest {
    public static void main(String[] args) {
        ConstructorException p = null;
        try {
            p = new ConstructorException(0);
        } catch (ArithmeticException e) {
            System.out.println("Гасим исключение конструктора.");
        }
        System.out.println(p.getI());
    }
}
