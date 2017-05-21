package enumerations;

public class CoffeeSizeDemo3 {
    public static void main(String[] args) {
        CoffeeSize coffeeSize;
        System.out.println("Кoнcтaнты перечислимого типа CoffeeSize:");
        CoffeeSize[] coffeeSizes = CoffeeSize.values();
        for (CoffeeSize c : coffeeSizes) {
            System.out.println(c);
        }
        System.out.println();

        coffeeSize = CoffeeSize.valueOf("BIG");
        System.out.println("Переменная coffeeSize содержит " + coffeeSize);
    }
}
