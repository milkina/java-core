package generics;

public class GenConstructor {
    private double value;

    public <T extends Number> GenConstructor(T arg) {
        value = arg.doubleValue();
    }

    public void showValue() {
        System.out.println("value: " + value);
    }
}

