package lambda.stream;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {

        Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        HashSet<String> filteredPhones = phones.filter(s -> s.length() < 8)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(filteredPhones);
    }
}
