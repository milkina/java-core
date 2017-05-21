package enumerations;

public class CoffeeSizeDemo6 {
    public static void main(String[] args) {
        CoffeeSize coffeeSize1 = CoffeeSize.BIG;
        CoffeeSize coffeeSize2 = CoffeeSize.HUGE;
        CoffeeSize coffeeSize3 = CoffeeSize.BIG;

        if (coffeeSize1.equals(coffeeSize2)) {
            System.out.println("Oшибкa!");
        }
        if (coffeeSize1.equals(coffeeSize3)) {
            System.out.println(coffeeSize1 + " равно " + coffeeSize3);
        }
        if (coffeeSize1 == coffeeSize3) {
            System.out.println(coffeeSize1 + " == " + coffeeSize3);
        }
    }
}
