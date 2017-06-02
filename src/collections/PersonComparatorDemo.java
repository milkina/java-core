package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class PersonComparatorDemo {
    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();
        SortedSet<Person> set = new TreeSet<>(personComparator);
        set.add(new Person("Elvis", "Goodyear", 56));
        set.add(new Person("Stanley", "Clark", 8));
        set.add(new Person("Jane", "Graff", 16));
        set.add(new Person("Nancy", "Goodyear", 69));
        //Обратите внимание - было добавлено 4 элемента, но распечатано 3
        for (Person person : set) {
            System.out.println(person);
        }
    }
}
