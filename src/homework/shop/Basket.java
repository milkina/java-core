package homework.shop;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Set;

public class Basket {
    private Set<Product> products;

    public Basket() {
        initializeProducts();
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void printProducts() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("text");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.printf("%s:%n", resourceBundle.getString("user.bought"));
        System.out.printf("%s:%s%n", resourceBundle.getString("date"),
                LocalDateTime.now().format(formatter));
        System.out.printf("%-10s %10s%n", resourceBundle.getString("products"),
                resourceBundle.getString("price"));
        System.out.println("--------------------------------------");
        double sum = 0;
        for (Product product : products) {
            double price = product.getPrice();
            sum += price;
            System.out.format("%-10s %10s%n", product.getName(), numberFormat.format(price));
        }
        System.out.println("--------------------------------------");
        System.out.format("%s:%15s%n", resourceBundle.getString("total"), numberFormat.format(sum));
    }

    public void initializeProducts() {
        this.products = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(products, basket.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }
}
