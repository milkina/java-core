package flow;

import enumerations.CoffeeSize;

public class SwitchEnumOld {
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.BIG;
        switch (coffeeSize) {
            case BIG:
                System.out.println("2");
            case HUGE:
                System.out.println("3");
            case OVERWHELMING:
                System.out.println("4");
        }
    }
}
