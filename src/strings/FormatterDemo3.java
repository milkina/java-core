package strings;

import java.util.Date;

public class FormatterDemo3 {
    public static void main(String[] args) {
        System.out.printf("%1$s %2$tB %2$td, %2$tY\n", "Дата:", new Date());
        System.out.printf("%s %tB %<td, %<tY", "Дата:", new Date());
    }
}
