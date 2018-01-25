package pattern.decorator;

public class SimpleWrapperDecorator extends Decorator {
    public static final int PRICE = 34;

    public SimpleWrapperDecorator(ClothI cloth) {
        super(cloth);
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + PRICE;
    }
}
