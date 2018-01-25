package pattern.decorator;

public class PostDelivery extends Decorator {
    public static final int PRICE = 56;

    public PostDelivery(ClothI cloth) {
        super(cloth);
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + PRICE;
    }
}
