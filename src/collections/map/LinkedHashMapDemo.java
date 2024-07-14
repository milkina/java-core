package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Double> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Петров", 123.22);
        linkedHashMap.put("Сидоров", 1378.00);
        linkedHashMap.put("Иванов", 3434.34);

        linkedHashMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
