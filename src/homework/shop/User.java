package homework.shop;

public class User {
    private String login;
    private String password;
    private Basket basket = new Basket();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void bought() {
        basket.printProducts();
        basket.initializeProducts();
    }

    public void addProduct(Product product) {
        basket.addProduct(product);
    }
}
