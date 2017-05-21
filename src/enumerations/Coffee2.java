package enumerations;

public class Coffee2 {
    CoffeeSize2 size;

    public static void main(String[] args) {
        Coffee2 drink1 = new Coffee2();
        drink1.size = CoffeeSize2.BIG;

        Coffee2 drink2 = new Coffee2();
        drink2.size = CoffeeSize2.OVERWHELMING;

        System.out.println(drink1.size.getOunces());
        for (CoffeeSize2 cs : CoffeeSize2.values()) {
            System.out.println(cs + " " + cs.getOunces());
        }
    }
}
