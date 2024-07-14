package homework.shop;

public class MainUtility {
    private static User ann = new User("ann", "annpass");
    private static User john = new User("john", "johnpass");
    private static User[] users = new User[10];

    private static int userCount;

    static {
        users[0] = ann;
        users[1] = john;

        userCount = 2;
    }

    public static User login(String login, String password) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getLogin().equals(login)
                    && users[i].getPassword().equals(password)) {
                System.out.println("Пользователь залогинен.");
                return users[i];
            } else if (users[i].getLogin().equals(login)
                    && !users[i].getPassword().equals(password)) {
                System.out.println("Неправильный пароль.");
                return null;
            }
        }
        User user = new User(login, password);
        users[userCount++] = user;
        System.out.println("Создан новый пользователь.");
        return user;
    }

    public static void printCatalogs(Category[] categories) {
        for (int i = 0; i < categories.length; i++) {
            System.out.println("Catalog " + (i + 1) + ": " + categories[i].getName());
        }
    }

    public static void printCatalog(int i, Category[] categories) {
        Category category = categories[--i];
        printProducts(category);
        System.out.println();
    }

    public static void printProducts(Category category) {
        Product[] products = category.getProducts();
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product " + (i + 1) + ": " + products[i].getName());
        }
    }

    public static void buyProducts(User user) {
        if (user == null) {
            System.out.println("Пользователь должен залогиниться.");
        } else {
            user.bought();
        }
    }
}
