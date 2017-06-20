package inner;

import oop.Person;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        SortedSet<Person> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        set.add(new Person("Иванов", 45, false));
        set.add(new Person("Петров", 31, false));
        set.add(new Person("Сидоров", 65, true));
        System.out.println(set);
    }
}
