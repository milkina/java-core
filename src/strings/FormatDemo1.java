package strings;

public class FormatDemo1 {
    public static void main(String[] args) {
        double x = 1000.0 / 3.0;
        System.out.println("Строка без форматирования: " + x);
        System.out.printf("Строка c форматированием: %.2f", x);
        System.out.println();
        System.out.printf("Строка c форматированием: %8.2f", x);
        System.out.println();
        String str = String.format("Строка c форматированием: %16.2f", x);
        System.out.println(str);

        System.out.printf("%s, в следующем году вам будет %d", "Джон", 23);
    }
}
