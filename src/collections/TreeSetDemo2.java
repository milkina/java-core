package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<>();

        treeSet.add("Харьков");
        treeSet.add("Киев");
        treeSet.add("Львов");
        treeSet.add("Кременчуг");
        treeSet.add("Харьков");

        System.out.println(treeSet);

        SortedSet<String> subSet = treeSet.subSet("Киев", "Львов");
        System.out.println("SubSet: " + subSet);

        System.out.println("HeadSet: " + treeSet.headSet("Львов"));
        System.out.println("TailSet: " + treeSet.tailSet("Львов"));
        System.out.println("Первый элемент: " + treeSet.first());
        System.out.println("Последний элемент: " + treeSet.last());
    }
}
