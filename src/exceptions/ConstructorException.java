package exceptions;

public class ConstructorException {
    private int i;

    public ConstructorException(int i) {
        this.i = 20 / i;
    }

    public int getI() {
        return i;
    }

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
