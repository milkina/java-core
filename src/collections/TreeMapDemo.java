package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[]) {
        // Create a tree map.
        Map<String, Double> tm = new TreeMap<>();

        // Put elements to the map.
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        // Get a set of the keys.
        Set<String> set = tm.keySet();

        // Display the elements.
        for (String me : set) {
            System.out.print(me + ": ");
            System.out.println(tm.get(me));
        }
        System.out.println();

        // Deposit 1000 into John Doe's account.
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " +
                tm.get("John Doe"));
        for (Double value : tm.values()) {
            System.out.println(value);
        }
    }
}

