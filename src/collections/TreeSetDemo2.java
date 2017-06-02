package collections;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String args[]) {
        SortedSet<String> treeSet = new TreeSet<>();

        treeSet.add("Бета");
        treeSet.add("Aльфa");
        treeSet.add("Этa");
        treeSet.add("Гaммa");
        treeSet.add("Эпсилон");
        treeSet.add("Омeгa");

        System.out.println(treeSet);

        SortedSet subSet = treeSet.subSet("Бета", "Омeгa");
        System.out.println(subSet);
    }
}
