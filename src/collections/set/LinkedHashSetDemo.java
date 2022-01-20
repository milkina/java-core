package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Харьков");
        set.add("Киев");
        set.add("Львов");
        set.add("Кременчуг");
        set.add("Харьков");

        System.out.println(set);
    }
}
