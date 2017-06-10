package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyCheckedCollection {
    public static void main(String a[]) {
        List myList = new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        Collection chkList = Collections.checkedCollection(myList, String.class);
        System.out.println("Checked list content: " + chkList);
        //you can add any type of elements to myList object
        myList.add(10);
        //you cannot add any type of elements to chkList object, doing so
        //throws ClassCastException
        chkList.add(10); //throws ClassCastException
    }
}
