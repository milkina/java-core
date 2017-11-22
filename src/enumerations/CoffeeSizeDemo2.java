package enumerations;

public class CoffeeSizeDemo2 {
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.BIG;
        switch (coffeeSize) {
            case BIG:
                System.out.println("Give me a big cup of coffee!");
                break;
            case HUGE:
                System.out.println("Give me a huge cup of coffee!");
                break;
            case OVERWHELMING:
                System.out.println("Give me an overwhelming cup of coffee!");
                break;
            default:
                System.out.println("The cup isn't selected");
        }
    }
}
