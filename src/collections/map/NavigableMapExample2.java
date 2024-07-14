package collections.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample2 {
    public static void main(String[] args) {
        NavigableMap<Integer, Double> navigableMap = new TreeMap<>();

        navigableMap.put(3, 3434.34);
        navigableMap.put(2, 1378.00);
        navigableMap.put(1, 123.22);
        navigableMap.put(4, 444.00);
        navigableMap.put(5, 555.00);
        navigableMap.put(100, 123.22);

        System.out.println("navigableMap: " + navigableMap);
        System.out.println("firstEntry: " + navigableMap.firstEntry());
        System.out.println("pollFirstEntry: " + navigableMap.pollFirstEntry());
        System.out.println("lastEntry: " + navigableMap.lastEntry());
        System.out.println("pollLastEntry: " + navigableMap.pollLastEntry());

        System.out.println("navigableMap: " + navigableMap);
    }
}
