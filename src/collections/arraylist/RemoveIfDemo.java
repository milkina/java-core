package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIfDemo {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("", "123", null, "abc"));
        words.removeIf(t -> t == null || t.isEmpty());
        System.out.println(words);
    }
}
