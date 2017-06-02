package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String args[]) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Бета");
        hashSet.add("Aльфa");
        hashSet.add("Этa");
        hashSet.add("Гaммa");
        hashSet.add("Эпсилон");
        hashSet.add("Oмeгa");

        System.out.println(hashSet);
    }
}
