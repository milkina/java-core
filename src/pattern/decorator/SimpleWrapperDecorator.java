package pattern.decorator;

public class SimpleWrapperDecorator extends Decorator {
    public static final int PRICE = 34;
    public static final int TIME = 1;

    public SimpleWrapperDecorator(Product cloth) {
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
        System.out.println("Обычная упаковка: " + PRICE);
    }

    @Override
    public void printDetailedTime() {
        super.printDetailedTime();
        System.out.println("Обычная упаковка: " + calculateTime() + " день");
    }
}
