package enumerations;

public class CoffeeSizeLidCodeDemo {
    public static void main(String[] args) {
        for (CoffeeSize4 coffeeSize : CoffeeSize4.values()) {
            System.out.println(coffeeSize + " " + coffeeSize.getLidCode());
        }
    }
}
