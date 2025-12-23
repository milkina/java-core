package homework.shop;

import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static User user = null;

    public static void main(String[] args) {

        Map<String, Product> clothProducts = new TreeMap<>();
        Product jeans = new Product("jeans", 30, 5);
        Product jumper = new Product("jumper", 40, 4);
        Product shirt = new Product("shirt", 50, 3);

        clothProducts.put(jeans.getName(), jeans);
        clothProducts.put(jumper.getName(), jumper);
        clothProducts.put(shirt.getName(), shirt);

        Map<String, Product> shoesProducts = new TreeMap<>();
        Product boots = new Product("boots", 20, 5);
        Product sneakers = new Product("sneakers", 15, 5);
        Product sandals = new Product("sandals", 50, 3);
        shoesProducts.put(boots.getName(), boots);
        shoesProducts.put(sneakers.getName(), sneakers);
        shoesProducts.put(sandals.getName(), sandals);

        Category clothes = new Category("Clothes", clothProducts);
        Category shoes = new Category("Shoes", shoesProducts);
        Map<String, Category> categories = new HashMap<>();
        categories.put(clothes.getName(), clothes);
        categories.put(shoes.getName(), shoes);

        UserOperation userOperation = null;

        do {
            System.out.println("Введите:\nLOGIN - для аутентификации,\n" +
                    "SHOW_CATALOGS_LIST - для просмотра списка каталогов товаров,\n" +
                    "SHOW_PRODUCTS_LIST - для просмотра списка товаров определенного каталога,\n" +
                    "ADD_PRODUCT - для добавления продукта в корзину\n" +
                    "BUY_PRODUCTS - для покупки,\n" +
                    "EXIT - для выхода из программы.");
            String operationString = scanner.nextLine();

            try {
                userOperation = UserOperation.valueOf(operationString);
                selectOperation(userOperation, categories);
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректно введено значение");
            }
        } while (userOperation != UserOperation.EXIT);
    }

    private static void selectOperation(UserOperation userOperation, Map<String, Category> categories) {
        switch (userOperation) {
            case LOGIN:
                user = login();
                break;
            case SHOW_CATALOGS_LIST:
                MainUtility.printCatalogs(categories);
                break;
            case SHOW_PRODUCTS_LIST:
                showProductsList(categories);
                break;
            case ADD_PRODUCT:
                addProduct(categories);
                break;
            case BUY_PRODUCTS:
                MainUtility.buyProducts(user);
                break;
        }
    }

    private static User login() {
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();

        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        return MainUtility.login(login, password);
    }

    private static void addProduct(Map<String, Category> categories) {
        if (user == null) {
            System.out.println("Пользователь должен залогиниться.");
        } else {
            System.out.println("Введите имя каталога");
            String catalogName = scanner.nextLine();
            if (!categories.containsKey(catalogName)) {
                System.out.println("Нет такого каталога.");
                return;
            }
            System.out.println("Введите имя продукта");
            String productName = scanner.nextLine();
            Map<String, Product> products = categories.get(catalogName).getProducts();
            if (!products.containsKey(productName)) {
                System.out.println("Нет такого продукта.");
                return;
            }

            user.addProduct(products.get(productName));
            System.out.println("Продукт добавлен в корзину.");
        }
    }

    public static void showProductsList(Map<String, Category> categories) {
        System.out.println("Введите имя каталога.");
        String catalogName = scanner.nextLine();
        MainUtility.printCatalog(catalogName, categories);
    }

    private static int getEnteredNumber() {
        int i;
        while (true)
            if (scanner.hasNextInt()) {
                i = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Некорректный ввод.");
            }
        return i;
    }
}