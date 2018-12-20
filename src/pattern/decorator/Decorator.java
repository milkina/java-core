package pattern.decorator;

public abstract class Decorator implements Product {
    private Product product;

    public Decorator(Product product) {
        this.product = product;
    }

    @Override
    public int calculatePrice() {
        return product.calculatePrice();
    }

    @Override
    public int calculateTime() {
        return product.calculateTime();
    }

    @Override
    public void printDetailedPrice() {
        product.printDetailedPrice();
    }

    @Override
    public void printDetailedTime() {
        product.printDetailedTime();
    }
}
