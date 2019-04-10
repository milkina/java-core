package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<>();

        treeSet.add("Харьков");
        treeSet.add("Киев");
        treeSet.add("Львов");
        treeSet.add("Кременчуг");
        treeSet.add("Харьков");

        System.out.println(treeSet);
    }
}
