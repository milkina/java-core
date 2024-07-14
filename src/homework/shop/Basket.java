package homework.shop;

public class Basket {
    private static final int MAX_PRODUCT = 10;
    private Product[] products;
    private int productCount;

    public Basket() {
        initializeProducts();
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            this.products[productCount++] = product;
        }
    }

    public void printProducts() {
        System.out.println("Пользователь купил:");
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i].getName());
        }
    }

    public void initializeProducts() {
        this.products = new Product[MAX_PRODUCT];
        productCount = 0;
    }
}
