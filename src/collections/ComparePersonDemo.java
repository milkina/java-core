package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparePersonDemo {
    public static void main(String[] args) {
        SortedSet<Person> set = new TreeSet<>();
        set.add(new Person("Elvis", "Goodyear", 56));
        set.add(new Person("Stanley", "Clark", 8));
        set.add(new Person("Jane", "Graff", 16));
        set.add(new Person("Nancy", "Goodyear", 69));
        for (Person person : set) {
            System.out.println(person);
        }
    }
}
