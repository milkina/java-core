package formatter;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo1 {
    public static void main(String[] args) {
        double number = 123.4567;
        Locale locFR = new Locale("fr");
        NumberFormat numberFormat1 = NumberFormat.getInstance();
        System.out.println("Число в текущей локали: " + numberFormat1.format(number));

        NumberFormat numberFormat2 = NumberFormat.getInstance(locFR);
        System.out.println("Число во французской локали: " + numberFormat2.format(number));

        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance();
        System.out.println("Денежная единица в текущей локали: " + numberFormat3.format(number));

        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(locFR);
        System.out.println("Денежная единица во французской локали: " + numberFormat4.format(number));

        NumberFormat numberFormat5 = NumberFormat.getPercentInstance();
        System.out.println("Процент в текущей локали: " + numberFormat5.format(number));

        NumberFormat numberFormat6 = NumberFormat.getPercentInstance(locFR);
        System.out.println("Процент во французской локали: " + numberFormat6.format(number));
    }
}
