package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaab");
        boolean b = m.matches();
        System.out.println(b);
    }
}