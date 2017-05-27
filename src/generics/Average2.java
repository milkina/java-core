package generics;

public class Average2<T extends Number> {
    T[] array;

    public Average2(T[] array) {
        this.array = array;
    }

    public double average() {
        double sum = 0.0;

        for (T value : array) {
            sum += value.doubleValue();
        }

        return sum / array.length;
    }

    boolean sameAvg(Average2<?> ob) {
        return average() == ob.average();
    }
}