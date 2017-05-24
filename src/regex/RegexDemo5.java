package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java5tiger 77 java6mustang");
        System.out.print(Arrays.toString(words));
    }
}
