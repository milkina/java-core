package strings;

public class StringDemo5 {
    public static void main(String[] args) {
        System.out.println("Foobar".endsWith("bar"));
        System.out.println("Foobar".startsWith("Foo"));
        System.out.println("Hello world!!!".regionMatches(6, "world", 0, 5));
    }
}
