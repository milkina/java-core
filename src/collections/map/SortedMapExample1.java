package collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample1 {
    public static void main(String[] args) {
        SortedMap<Integer, Double> treeMap = new TreeMap<>();

        treeMap.put(3, 3434.34);
        treeMap.put(2, 1378.00);
        treeMap.put(1, 123.22);
        treeMap.put(100, 123.22);

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
    }
}
