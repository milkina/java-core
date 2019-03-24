package wrappers;

public class AutoBoxImmutability {
    public static void main(String[] args) {
        Integer y = 567;
        Integer x = y;
        // проверяем, что x и y указывают на один объект
        System.out.println(y == x);

        y++;
        System.out.println(x + " " + y);
        // проверяем, что x и y указывают на один объект
        System.out.println(y == x);
    }
}
