package enumerations;

public class CoffeeSizeDemo5 {
    public static void main(String[] args) {
        CoffeeSize coffeeSize1 = CoffeeSize.BIG;
        CoffeeSize coffeeSize2 = CoffeeSize.HUGE;
        CoffeeSize coffeeSize3 = CoffeeSize.BIG;

        if (coffeeSize1.compareTo(coffeeSize2) < 0) {
            System.out.println(coffeeSize1 + " предшествует " + coffeeSize2);
        }
        if (coffeeSize1.compareTo(coffeeSize2) > 0) {
            System.out.println(coffeeSize2 + " предшествует " + coffeeSize1);
        }
        if (coffeeSize1.compareTo(coffeeSize3) == 0) {
            System.out.println(coffeeSize1 + " равно " + coffeeSize3);
        }
    }
}
