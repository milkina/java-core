package generics;

public class AverageDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Average<Integer> integerAverage = new Average<>(intArray);
        System.out.println("Среднее значения для Integer " + integerAverage.average());

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Average<Double> doubleAverage = new Average<>(doubleArray);
        System.out.println("Среднее значения для Double " + doubleAverage.average());

        // Не откомпилируется,
        // потому что String не является наследником Number
       /* String[] strArray = {"1", "2", "3", "4", "5"};
        Average<String> strAverage = new Average<>(strArray);

        System.out.println("Среднее значения для String " + strAverage.average());*/
    }
}

