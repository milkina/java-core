package strings;

import java.util.Locale;

public class LocaleDemo1 {
    public static void main(String[] args) {
        Locale fr = Locale.FRANCE;
        Locale us = Locale.US;
        Locale uk = new Locale("uk", "UA");

        Locale.setDefault(Locale.CANADA);
        Locale current = Locale.getDefault();
        getLocaleInfo(current);

        getLocaleInfo(fr);
        getLocaleInfo(us);
        getLocaleInfo(uk);
    }

    private static void getLocaleInfo(Locale current) {
        System.out.println("Код региона: " + current.getCountry());
        System.out.println("Название региона: " + current.getDisplayCountry());
        System.out.println("Код языка региона: " + current.getLanguage());
        System.out.println("Название языка региона: "
                + current.getDisplayLanguage());
        System.out.println();
    }
}
