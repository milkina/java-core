package collections.map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapExample1 {
    public static void main(String[] args) {
        NavigableMap<Integer, Double> navigableMap = new TreeMap<>();

        navigableMap.put(3, 3434.34);
        navigableMap.put(2, 1378.00);
        navigableMap.put(1, 123.22);
        navigableMap.put(4, 444.00);
        navigableMap.put(5, 555.00);
        navigableMap.put(100, 123.22);

        System.out.println("lowerKey: " + navigableMap.lowerKey(4));
        System.out.println("floorKey: " + navigableMap.floorKey(4));
        System.out.println("higherKey: " + navigableMap.higherKey(4));
        System.out.println("ceilingKey: " + navigableMap.ceilingKey(4));
    }
}
