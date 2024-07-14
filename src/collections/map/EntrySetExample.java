package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetExample {
    public static void main(String[] args) {
        Map<String, Double> hashMap = new HashMap<>();

        hashMap.put("Иванов", 3434.34);
        hashMap.put("Петров", 123.22);
        hashMap.put("Сидоров", 1378.00);

        Set<Map.Entry<String, Double>> entries = hashMap.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.print("Ключ: " + entry.getKey());
            System.out.println(" Значение: " + entry.getValue());
        }
    }
}
