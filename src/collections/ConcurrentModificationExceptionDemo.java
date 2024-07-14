package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        Iterator<String> iterator = arrayList.iterator();
        arrayList.add("R");

        while (iterator.hasNext()) {
               System.out.println(iterator.next()); //ConcurrentModificationException
        }
    }
}
