package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Харьков");
        hashSet.add("Киев");
        hashSet.add("Львов");
        hashSet.add("Кременчуг");
        hashSet.add("Харьков");

        System.out.println(hashSet);
    }
}
