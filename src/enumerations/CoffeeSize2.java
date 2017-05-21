package enumerations;

public enum CoffeeSize2 {
    // 8, 10 & 16 are passed to the constructor
    BIG(8), HUGE(10), OVERWHELMING(16);

    CoffeeSize2(int ounces) { // constructor
        this.ounces = ounces;
    }

    private int ounces; // an instance variable

    public int getOunces() {
        return ounces;
    }
}
