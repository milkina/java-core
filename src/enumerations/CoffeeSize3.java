package enumerations;

public enum CoffeeSize3 {
    BIG(100), HUGE, OVERWHELMING(200);

    private int ml;

    CoffeeSize3(int ml) {
        this.ml = ml;
    }

    CoffeeSize3() {
        this.ml = -1;
    }

    public int getMl() {
        return ml;
    }
}
