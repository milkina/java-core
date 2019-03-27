package strings;

import java.util.Arrays;

public class SortString {
    private static String[] array = {
            "Для", "работы", "со", "строками", "в", "языке", "Java",
            "используются", "классы", "String", "StringBuilder", "StringBuffer"
    };

    public static void main(String[] args) {
        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[i].compareTo(array[j]) < 0) {
                    String t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
