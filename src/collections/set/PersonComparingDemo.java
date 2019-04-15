package collections.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PersonComparingDemo {
    public static void main(String[] args) {
        Comparator<Person> personComparator =
                Comparator.comparing(Person::getLastName).thenComparing(Person::getAge);
        SortedSet<Person> set = new TreeSet<>(personComparator);
        set.add(new Person("Саша", "Иванов", 36));
        set.add(new Person("Маша", "Петрова", 23));
        set.add(new Person("Даша", "Сидорова", 34));
        set.add(new Person("Вася", "Иванов", 25));
        set.forEach(System.out::println);
    }
}
