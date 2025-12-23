package homework.shop;

import java.util.*;

public class MainUtility {
    private static final User ann = new User("ann", "annpass");
    private static final User john = new User("john", "johnpass");
    private static Set<User> users = new HashSet<>();

    static {
        users.add(ann);
        users.add(john);
    }

    public static User login(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login)
                    && user.getPassword().equals(password)) {
                System.out.println("Пользователь залогинен.");
                return user;
            } else if (user.getLogin().equals(login)
                    && !user.getPassword().equals(password)) {
                System.out.println("Неправильный пароль.");
                return null;
            }
        }
        User user = new User(login, password);
        users.add(user);
        System.out.println("Создан новый пользователь.");
        return user;
    }

    public static void printCatalogs(Map<String, Category> categories) {
        categories.keySet().forEach(System.out::println);
    }

    public static void printCatalog(String catalogName, Map<String, Category> categories) {
        Category category = categories.get(catalogName);
        printProducts(category);
        System.out.println();
    }

    public static void printProducts(Category category) {
        Map<String, Product> products = category.getProducts();
        Set<Product> set = new TreeSet<>(products.values());
        set.forEach(product -> System.out.println("Product " + product));
    }

    public static void buyProducts(User user) {
        if (user == null) {
            System.out.println("Пользователь должен залогиниться.");
        } else {
            user.bought();
        }
    }
}
