package wrappers;

public class AutoBoxDemo8 {
    public static void main(String[] args) {
        Boolean b = true;

        if (b) {
            System.out.println("publicVar is true");
        }

        Character ch = 'x';
        char ch2 = ch;

        System.out.println("ch2 is " + ch2);
    }
}
