package formatter;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo1 {
    public static void main(String[] args) {
        float f1 = 123.4567f;
        Locale locFR = new Locale("fr"); // France
        NumberFormat[] nfa = new NumberFormat[6];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locFR);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locFR);
        nfa[4] = NumberFormat.getPercentInstance();
        nfa[5] = NumberFormat.getPercentInstance(locFR);
        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(f1));
        }
    }
}
