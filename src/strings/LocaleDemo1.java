package strings;

import java.util.Locale;

public class LocaleDemo1 {
    public static void main(String[] args) {
        Locale fr = Locale.FRANCE;
        Locale us = Locale.US;
        Locale rus = new Locale("ru", "RU");

        Locale current = Locale.getDefault();
        getLocaleInfo(current);

        Locale.setDefault(Locale.CANADA);
        current = Locale.getDefault();
        getLocaleInfo(current);

        Locale.setDefault(new Locale("uk", "UA"));
        current = Locale.getDefault();
        getLocaleInfo(current);
    }

    public static void getLocaleInfo(Locale current) {
        System.out.println("Код региона: " + current.getCountry());
        System.out.println("Название региона: " + current.getDisplayCountry());
        System.out.println("Код языка региона: " + current.getLanguage());
        System.out.println("Название языка региона: " + current.getDisplayLanguage());
        System.out.println();
    }
}
