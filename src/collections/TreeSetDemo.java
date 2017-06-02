package collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]) {
        NavigableSet<String> treeSet = new TreeSet<>();

        treeSet.add("Бета");
        treeSet.add("Aльфa");
        treeSet.add("Этa");
        treeSet.add("Гaммa");
        treeSet.add("Эпсилон");
        treeSet.add("Омeгa");

        System.out.println(treeSet);
    }
}
