package collections;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
     @Override
     public int compare(Person o1, Person o2) {
         return o1.getLastName().compareTo(o2.getLastName());
     }
    /*@Override
    public int compare(Person o1, Person o2) {
        int result = o1.getLastName().compareTo(o2.getLastName());
        if (result != 0) {
            return result;
        } else {
            return o1.getAge() - o2.getAge();
        }
    }*/
}
