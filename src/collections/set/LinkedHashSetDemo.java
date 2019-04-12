package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Харьков");
        linkedHashSet.add("Киев");
        linkedHashSet.add("Львов");
        linkedHashSet.add("Кременчуг");
        linkedHashSet.add("Харьков");

        System.out.println(linkedHashSet);
    }
}
