package collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class PersonComparatorDemo {
    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();
        SortedSet<Person> set = new TreeSet<>(personComparator);
        set.add(new Person("Саша", "Иванов", 36));
        set.add(new Person("Маша", "Петрова", 23));
        set.add(new Person("Даша", "Сидорова", 34));
        set.add(new Person("Вася", "Иванов", 25));
        //Обратите внимание - было добавлено 4 элемента, но распечатано 3
        set.forEach(System.out::println);
    }
}
