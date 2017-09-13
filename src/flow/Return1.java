package flow;

public class Return1 {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Дo возврата.");
        if (t) {
            return; // возврат ввызывающий код
        }
        System.out.println("Этoт оператор выполняться не будет.");
    }
}
