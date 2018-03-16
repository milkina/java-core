package lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamDemo5 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("", "2332", null, "dfdf"));
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String w = iterator.next();
            if (w == null || w.isEmpty()) {
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
