package formatter;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatDemo4 {
    public static void main(String[] args) throws ParseException {
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.parse("1234,567"));
        nf.setParseIntegerOnly(true);
        System.out.println(nf.parse("1234,567"));
    }
}
