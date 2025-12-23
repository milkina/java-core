package collections.homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        String str = "1, 2, 3, 4, 4, 5,  10,11";
        String[] strings = str.split(",\\s*");
        List<String> list = Arrays.asList(strings);
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}
