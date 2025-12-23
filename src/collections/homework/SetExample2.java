package collections.homework;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<String> set3 = new HashSet<>();
        set3.add("aaaa");
        set3.add("bbbb");
        set3.add("ccc");

        Set<String> set4 = new HashSet<>();
        set4.add("ccc");
        set4.add("ddd");
        set4.add("fff");


        System.out.println(union(set1, set2));
        System.out.println(union(set3, set4));
        System.out.println(intersect(set1, set2));
        System.out.println(intersect(set3, set4));
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}
