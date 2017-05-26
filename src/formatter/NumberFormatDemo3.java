package formatter;

import java.text.NumberFormat;

public class NumberFormatDemo3 {
    public static void main(String[] args) {
        double d = 123.45678;
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMinimumFractionDigits() + " ");
        System.out.println(nf.format(d) + " ");
        nf.setMinimumFractionDigits(7);
        System.out.println(nf.format(d) + " ");
        nf.setMinimumIntegerDigits(5);
        System.out.println(nf.format(d) + " ");
    }
}
