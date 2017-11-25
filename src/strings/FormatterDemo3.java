package strings;

public class FormatterDemo3 {
    public static void main(String[] args) {
        System.out.printf("Hello %1$s!%n%1$s, how are you?%n"
                        + "Welcome to the site %2$s",
                "John", "www.site.com");
    }
}
