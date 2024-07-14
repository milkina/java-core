package collections.map;

import java.util.HashMap;
import java.util.Map;

public class IsEmptyExample {
    public static void main(String[] args) {
        Map<String, Double> hashMap = new HashMap<>();

        System.out.println(hashMap.isEmpty());

        hashMap.put("Иванов", 3434.34);
        hashMap.put("Петров", 123.22);
        hashMap.put("Сидоров", 1378.00);

        System.out.println(hashMap.isEmpty());
    }
}
