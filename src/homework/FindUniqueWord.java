package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindUniqueWord {
    public static void main(String[] args) {
        String str = "dsdsdfg 34df  fdfdfd    fgfg_45";
        String[] words = str.split("\\s+");

        int min = str.length();
        String result = str;

        for (String word : words) {
            if (isAppropriateWord(word)) {
                String wordWithoutDuplicates = removeDuplicates(word);
                if (wordWithoutDuplicates.length() < min) {
                    min = wordWithoutDuplicates.length();
                    result = word;
                }
            }
        }
        System.out.println(result);
    }

    private static boolean isAppropriateWord(String s) {
        Pattern pattern = Pattern.compile("[a-zA-Z\\d]+");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    private static String removeDuplicates(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char letter = stringBuilder.charAt(i);
            deleteCharacters(stringBuilder, letter + "", i + 1);
        }
        return stringBuilder.toString();
    }

    private static void deleteCharacters(StringBuilder stringBuilder, String letter, int i) {
        int pos;
        while ((pos = stringBuilder.indexOf(letter, i)) != -1) {
            stringBuilder.deleteCharAt(pos);
        }
    }
}

