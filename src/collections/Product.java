package collections;

import java.util.Objects;

public class Product {
    private String name;
    private int cost;
    private String manufacturer;

    public Product(String name, int cost, String manufacturer) {
        this.name = name;
        this.cost = cost;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product toy = (Product) o;
        return cost == toy.cost &&
                Objects.equals(name, toy.name) &&
                Objects.equals(manufacturer, toy.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, manufacturer);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
