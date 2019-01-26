package exceptions;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        try {
            parseNumber("Какое-то число");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Конец программы.");
    }

    public static void parseNumber(String str) throws ParseException {
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.parse(str));
    }
}
