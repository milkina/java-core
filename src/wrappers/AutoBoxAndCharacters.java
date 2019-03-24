package wrappers;

public class AutoBoxAndCharacters {
    public static void main(String[] args) {
        Boolean b = true;

        if (b) {
            System.out.println("В if тоже можно использовать распаковку.");
        }

        Character ch = 'x';
        char ch2 = ch;

        System.out.println("ch2 = " + ch2);
    }
}
