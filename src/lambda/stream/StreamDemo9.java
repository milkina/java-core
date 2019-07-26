package lambda.stream;

import oop.ColorBox;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {
        Stream<ColorBox> stream = Stream.of(new ColorBox(1, 1, 1, "red"),
                new ColorBox(2, 2, 2, "green"),
                new ColorBox(3, 3, 3, "blue"),
                new ColorBox(4, 4, 4, "black"));


        Map<String, ColorBox> map = stream
                .collect(Collectors.toMap(box -> box.color, box -> box));

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
