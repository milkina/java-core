package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class BackedCollections {
    public static void main(String[] args) {
        SortedMap<String, String> map = new TreeMap<>();
        map.put("a", "ant");
        map.put("d", "dog");
        map.put("h", "horse");

        SortedMap<String, String> subMap = map.subMap("b", "g"); // #1 create a backed collection
        System.out.println(map + " " + subMap); // #2 show contents

        map.put("b", "bat"); // #3 add to original
        subMap.put("f", "fish"); // #4 add to copy
        map.put("r", "raccoon"); // #5 add to original - out of range
        // subMap.put("p", "pig"); // #6 add to copy - out of range
        System.out.println(map + " " + subMap); // #7 show final contents
    }
}
