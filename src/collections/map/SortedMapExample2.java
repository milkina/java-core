package collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample2 {
    public static void main(String[] args) {
        SortedMap<Integer, Double> treeMap = new TreeMap<>();

        treeMap.put(3, 3434.34);
        treeMap.put(2, 1378.00);
        treeMap.put(1, 123.22);
        treeMap.put(4, 444.00);
        treeMap.put(5, 555.00);
        treeMap.put(100, 123.22);

        System.out.println("treeMap: " + treeMap);
        System.out.println("headMap: " + treeMap.headMap(3));
        System.out.println("subMap: " + treeMap.subMap(3, 5));
        System.out.println("tailMap: " + treeMap.tailMap(4));
    }
}
