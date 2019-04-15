package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class BackedCollections {
    public static void main(String[] args) {
        SortedMap<String, String> map = new TreeMap<>();
        map.put("а", "арбуз");
        map.put("в", "вишня");
        map.put("д", "дыня");

        SortedMap<String, String> subMap = map.subMap("б", "ж");
        System.out.println(map + " " + subMap);

        map.put("б", "брусника");
        subMap.put("г", "груша");
        map.put("я", "яблоко");
        //   subMap.put("с", "слива");
        System.out.println(map + " " + subMap);
    }
}
