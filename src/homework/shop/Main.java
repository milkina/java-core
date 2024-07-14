package homework.shop;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static User user = null;

    public static void main(String[] args) {

        Product[] clothProducts = new Product[3];
        clothProducts[0] = new Product("jeans", 30, 5);
        clothProducts[1] = new Product("jumper", 40, 4);
        clothProducts[2] = new Product("shirt", 50, 3);

        Product[] shoesProducts = new Product[3];
        shoesProducts[0] = new Product("boots", 20, 5);
        shoesProducts[1] = new Product("sneakers", 15, 5);
        shoesProducts[2] = new Product("sandals", 50, 3);

        Category clothes = new Category("Clothes", clothProducts);
        Category shoes = new Category("Shoes", shoesProducts);
        Category[] categories = new Category[]{clothes, shoes};

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

    private static void selectOperation(UserOperation userOperation, Category[] categories) {

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

    private static void addProduct(Category[] categories) {
        if (user == null) {
            System.out.println("Пользователь должен залогиниться.");
        } else {
            System.out.println("Введите номер каталога");
            int catalogNumber = getEnteredNumber();
            if (catalogNumber >= categories.length) {
                System.out.println("Нет такого каталога.");
                return;
            }
            System.out.println("Введите номер продукта");
            int productNumber = getEnteredNumber();
            Product[] products = categories[catalogNumber - 1].getProducts();
            if (productNumber >= products.length) {
                System.out.println("Нет такого продукта.");
                return;
            }

            user.addProduct(products[productNumber - 1]);
            System.out.println("Продукт добавлен в корзину.");
        }
    }

    public static void showProductsList(Category[] categories) {
        System.out.println("Введите номер каталога.");
        int i = getEnteredNumber();
        MainUtility.printCatalog(i, categories);
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