package formatter;

import java.text.NumberFormat;

public class NumberFormatDemo3 {
    public static void main(String[] args) {
        double d = 123.45678;
        NumberFormat nf = NumberFormat.getInstance();

        System.out.print("Минимальное количество знаков в дробной части "
                + nf.getMinimumFractionDigits() + ": ");
        System.out.println(nf.format(d));

        nf.setMinimumFractionDigits(7);
        System.out.print("Минимальное количество знаков в дробной части 7: ");
        System.out.println(nf.format(d));

        nf.setMinimumIntegerDigits(5);
        System.out.print("Минимальное количество знаков в целой части 5: ");
        System.out.println(nf.format(d));
    }
}
