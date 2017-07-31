package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+\\s?");
        String[] words = pattern.split("java5tiger 77 java6mustang");
        System.out.print(Arrays.toString(words));
    }
}
