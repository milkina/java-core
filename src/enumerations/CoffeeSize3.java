package enumerations;

public enum CoffeeSize3 {
    BIG(8), HUGE, OVERWHELMING(16);

    CoffeeSize3(int ounces) { // constructor
        this.ounces = ounces;
    }

    CoffeeSize3() {
        this.ounces = -1;
    }

    private int ounces;

    public int getOunces() {
        return ounces;
    }
}
