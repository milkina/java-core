package pattern.decorator;

public class PostDelivery extends Decorator {
    public static final int PRICE = 56;
    public static final int TIME = 2;

    public PostDelivery(Product cloth) {
        super(cloth);
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + PRICE;
    }

    @Override
    public int calculateTime() {
        int time = super.calculateTime();
        return time > TIME ? time : TIME;
    }

    @Override
    public void printDetailedPrice() {
        super.printDetailedPrice();
        System.out.println("Доставка: " + PRICE);
    }

    @Override
    public void printDetailedTime() {
        super.printDetailedTime();
        System.out.println("Доставка почтой: " + calculateTime() + " день");
    }
}
