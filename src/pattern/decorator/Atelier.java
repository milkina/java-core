package pattern.decorator;

public class Atelier {
    public static void main(String[] args) {
        Product tie = new Tie(Size.S, 56, "Black");
        Product wrappedTie = new PostDelivery(new SimpleWrapperDecorator(tie));

        Product tShirt = new TShirt(Size.XS, 78, "White");
        Product wrappedTShirt = new SimpleWrapperDecorator(tShirt);

        buy(wrappedTie, wrappedTShirt);

        Cloth[] cloths = {(Cloth) tie, (Cloth) tShirt};
        wearMan(cloths);
        wearWoman(cloths);
    }


    public static void wearMan(Cloth[] cloths) {
        for (Cloth cloth : cloths) {
            if (cloth instanceof ManCloth) {
                ((ManCloth) cloth).wearMan();
            }
        }
    }

    public static void wearWoman(Cloth[] cloths) {
        for (Cloth cloth : cloths) {
            if (cloth instanceof WomanCloth) {
                ((WomanCloth) cloth).wearWoman();
            }
        }
    }

    public static void buy(Product... products) {
        for (Product product : products) {
            buy(product);
            System.out.println();
        }
    }

    public static void buy(Product product) {
        product.printDetailedPrice();
        System.out.println("Итого: " + product.calculatePrice() + " грн.");
        product.printDetailedTime();
        System.out.println("Итого: " + product.calculateTime() + " дня");
    }
}
