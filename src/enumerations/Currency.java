package enumerations;

public enum Currency implements Runnable {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    private int value;

    Currency(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println("Enum in Java implement interfaces");
    }
}
