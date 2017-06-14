package exceptions;

public class ThrowDemo {
    public static void doSomething() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException е) {
            System.out.println("Перехвачено внутри doSomething.");
            throw е; // повторно возбудить исключение
        }
    }

    public static void main(String args[]) {
        try {
            doSomething();
        } catch (NullPointerException е) {
            System.out.println("ПОВТОРНЫЙ перехват: " + е);
        }
    }
}
