package regex;

import java.util.Arrays;

/**
 * Created by Tatyana on 31.07.2017.
 */
public class RegexDemo6 {
    public static void main(String[] args) {
        String str = "java5tiger 77 java6mustang";
        String[] words = str.split("\\d+\\s?");
        System.out.print(Arrays.toString(words));
    }
}
