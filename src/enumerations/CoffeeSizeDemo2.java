package enumerations;

public class CoffeeSizeDemo2 {
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.BIG;
        switch (coffeeSize) {
            case BIG:
                System.out.println("Дайте мне большую чашку кофе!");
                break;
            case HUGE:
                System.out.println("Дайте мне огромную чашку кофе!");
                break;
            case OVERWHELMING:
                System.out.println("Дайте мне громадную чашку кофе!");
                break;
            default:
                System.out.println("Чашка не выбрана.");
        }
    }
}
