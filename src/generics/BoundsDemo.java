package generics;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer intArray[] = {1, 2, 3, 4, 5};
        Average<Integer> integerAverage = new Average<Integer>(intArray);
        double v = integerAverage.average();
        System.out.println("Integer average is " + v);

        Double doubleArray[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Average<Double> doubleAverage = new Average<Double>(doubleArray);
        double w = doubleAverage.average();
        System.out.println("DoubleAverage is " + w);

        // This won't compile because String is not a
        // subclass of Number.
       /* String strs[] = {"1", "2", "3", "4", "5"};
        Average<String> strob = new Average<String>(strs);

        double x = strob.average();
        System.out.println("strob average is " + v);*/
    }
}

