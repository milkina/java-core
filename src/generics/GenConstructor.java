package generics;

public class GenConstructor {
    private double val;

    <T extends Number> GenConstructor(T arg) {
        val = arg.doubleValue();
    }

    void showValue() {
        System.out.println("value: " + val);
    }
}

