package homework.shop;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

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

        UserOperation userOperation;
        do {
            System.out.println("Введите: LOGIN -, EXIT - для выхода из программы.");
            String operationString = scanner.nextLine();
            userOperation = UserOperation.valueOf(operationString);
            switch (userOperation) {
                case LOGIN:
                    login();
                    break;
            }
        } while (userOperation != UserOperation.EXIT);

        /*ann.bought(new Product[]{clothProducts[0]});
        john.bought(new Product[]{shoesProducts[1], clothProducts[1]});

        System.out.println("Catalog of products");
        printCatalog(categories);

        System.out.println("Ann bought:");
        printBasketProducts(ann);

        System.out.println("John bought:");
        printBasketProducts(john);*/
    }

    private static void login() {
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();

        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        UserUtility.login(login, password);
    }

    private static void printCatalog(Category[] categories) {
        for (Category category : categories) {
            System.out.println("Catalog " + category.getName() + ":");
            printProducts(category);
            System.out.println();
        }
    }

    private static void printProducts(Category category) {
        for (Product product : category.getProducts()) {
            System.out.println("Product " + product.getName());
        }
    }

    private static void printBasketProducts(User user) {
        for (Product product : user.getBasket().getProducts()) {
            System.out.println(product.getName());
        }
        System.out.println();
    }
}