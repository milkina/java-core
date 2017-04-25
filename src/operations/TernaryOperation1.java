package operations;

public class TernaryOperation1 {
    public static void main(String[] args) {
        int i, k;
        i = -10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной i
        System.out.print("Aбcoлютнoe значение ");
        System.out.println(i + " равно " + k);
    }
}
