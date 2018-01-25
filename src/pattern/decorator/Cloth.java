package pattern.decorator;

public abstract class Cloth {
    private Size size;
    private int price;
    private String color;

    public Cloth(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cloth cloth = (Cloth) o;

        if (getPrice() != cloth.getPrice()) return false;
        if (getSize() != cloth.getSize()) return false;
        return getColor() != null ? getColor().equals(cloth.getColor()) : cloth.getColor() == null;
    }

    @Override
    public int hashCode() {
        int result = getSize() != null ? getSize().hashCode() : 0;
        result = 31 * result + getPrice();
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
