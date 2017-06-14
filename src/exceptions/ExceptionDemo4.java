package exceptions;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        try {
            parseNumber("sss");
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void parseNumber(String str) throws ParseException {
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.parse(str));
    }
}
