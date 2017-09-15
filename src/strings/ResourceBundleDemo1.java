package strings;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo("", "");
        printInfo("US", "EN");
        printInfo("UA", "UK");
    }

    private static void printInfo(String country, String language) throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        String s1 = rb.getString("str1");
        s1 = new String(s1.getBytes("ISO-8859-1"), "UTF-8");

        System.out.println(s1);
        String s2 = rb.getString("str2");
        s2 = new String(s2.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(s2);
        System.out.println();
    }
}
