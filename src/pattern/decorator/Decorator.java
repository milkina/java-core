package pattern.decorator;

public abstract class Decorator implements ClothI {
    protected ClothI cloth;

    public Decorator(ClothI cloth) {
        this.cloth = cloth;
    }

    @Override
    public int calculatePrice() {
        return cloth.calculatePrice();
    }

    @Override
    public int calculateTime() {
        return cloth.calculateTime();
    }

    @Override
    public void printDetailedPrice() {
        cloth.printDetailedPrice();
    }

    @Override
    public void printDetailedTime() {
        cloth.printDetailedTime();
    }
}
