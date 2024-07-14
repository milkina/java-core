package collections.map;

import java.util.HashMap;
import java.util.Map;

public class ContainsExample {
    public static void main(String[] args) {
        Map<String, Double> hashMap = new HashMap<>();

        hashMap.put("Иванов", 3434.34);
        hashMap.put("Петров", 123.22);
        hashMap.put("Сидоров", 1378.00);

        System.out.println(hashMap.containsValue(123.22));
        System.out.println(hashMap.containsValue(123));
    }
}
