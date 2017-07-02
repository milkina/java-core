package flow;

public class SysExit {
    public static void main(String[] args) {
        System.out.println("Дo возврата.");
        method1(true);
        System.out.println("Этoт оператор выполняться не будет.");
    }

    public static void method1(boolean t) {
        if (t) {
            System.exit(0);
        }
        System.out.println("Этoт оператор метода выполняться не будет.");
    }
}
