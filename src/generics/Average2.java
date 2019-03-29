package generics;

public class Average2<T extends Number> {
    private T[] array;

    public Average2(T[] array) {
        this.array = array.clone();
    }

    public double average() {
        double sum = 0.0;

        for (T value : array) {
            sum += value.doubleValue();
        }

        return sum / array.length;
    }

    public boolean sameAvg(Average2<?> ob) {
        return average() == ob.average();
    }
}
