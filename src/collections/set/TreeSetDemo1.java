package collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        set.add("Харьков");
        set.add("Киев");
        set.add("Львов");
        set.add("Кременчуг");
        set.add("Харьков");

        System.out.println(set);
    }
}
