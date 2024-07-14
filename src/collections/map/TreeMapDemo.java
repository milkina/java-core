package collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Double> treeMap = new TreeMap<>();

        treeMap.put("Иванов", 3434.34);
        treeMap.put("Сидоров", 1378.00);
        treeMap.put("Петров", 123.22);


        treeMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

