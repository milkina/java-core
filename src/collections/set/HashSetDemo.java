package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Харьков");
        set.add("Киев");
        set.add("Львов");
        set.add("Кременчуг");
        set.add("Харьков");

        System.out.println(set);
    }
}
