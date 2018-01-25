package pattern.decorator;

public class Tie extends Cloth implements ManCloth {
    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void wearMan() {
        System.out.println("Одеваем на мужчину галстук " + this);
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
        System.out.println("Галстук: " + getPrice());
    }

    @Override
    public void printDetailedTime() {
        System.out.println("Галстук: " + 0 + " дней");
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
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
