package enumerations;

public enum CoffeeSize2 {
    // 100, 150 и 200 передаются в конструктор
    BIG(100), HUGE(150), OVERWHELMING(200);

    private int ml;

    CoffeeSize2(int ml) {
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }
}
