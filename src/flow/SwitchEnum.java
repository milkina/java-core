package flow;

import enumerations.CoffeeSize;

public class SwitchEnum {
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.BIG;
        double price = switch (coffeeSize) {
            case BIG:
                yield 2;
            case HUGE:
                yield 3;
            case OVERWHELMING:
                yield 4;
        };
    }
}
