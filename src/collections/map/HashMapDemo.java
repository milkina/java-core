package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Double> hashMap = new HashMap<>();

        hashMap.put("Иванов", 3434.34);
        hashMap.put("Петров", 123.22);
        hashMap.put("Сидоров", 1378.00);

        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            System.out.print(key + ": ");
            System.out.println(hashMap.get(key));
        }

        hashMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
