package strings;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Tatyana on 01.08.2017.
 */
public class ResourceBundleDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo("", "");

        printInfo("US", "EN");
        printInfo("UA", "UK");
    }

    private static void printInfo(String country, String language) throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
        System.out.println();
    }
}
