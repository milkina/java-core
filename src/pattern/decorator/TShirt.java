package pattern.decorator;

public class TShirt extends Cloth implements ManCloth, WomanCloth {
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void wearMan() {
        System.out.println("Одеваем на мужчину футболку " + this);
    }

    @Override
    public void wearWoman() {
        System.out.println("Одеваем на женщину футболку " + this);
    }

    @Override
    public int calculatePrice() {
        return getPrice();
    }

    @Override
    public int calculateTime() {
        return 0;
    }

    @Override
    public void printDetailedPrice() {
        System.out.println("Футболка: " + getPrice());
    }

    @Override
    public void printDetailedTime() {
        System.out.println("Футболка: " + 0 + " дней");
    }

    @Override
    public String toString() {
        return "TShirt{} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
