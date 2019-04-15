package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyCheckedCollection {
    public static void main(String[] a) {
        List myList = new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        Collection checkList =
                Collections.checkedCollection(myList, String.class);
        System.out.println("Checked list content: " + checkList);
        myList.add(10);
        checkList.add(10); //throws ClassCastException
    }
}
