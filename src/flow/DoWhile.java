package flow;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("Тик " + n--);
        } while (n > 0);
    }
}
