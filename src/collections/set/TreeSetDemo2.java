package collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        set.add("Харьков");
        set.add("Киев");
        set.add("Львов");
        set.add("Кременчуг");
        set.add("Харьков");

        System.out.println(set);

        SortedSet<String> subSet = set.subSet("Киев", "Львов");
        System.out.println("SubSet: " + subSet);

        System.out.println("HeadSet: " + set.headSet("Львов"));
        System.out.println("TailSet: " + set.tailSet("Львов"));
        System.out.println("Первый элемент: " + set.first());
        System.out.println("Последний элемент: " + set.last());
    }
}
