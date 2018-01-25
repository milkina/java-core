package pattern.decorator;

public class AtelierDemo {
    public static void main(String[] args) {
        ClothI tie = new Tie(Size.S, 56, "Black");
        ClothI wrappedTie = new PostDelivery(new SimpleWrapperDecorator(tie));
        wrappedTie.printDetailedPrice();
        System.out.println("Итого: " + wrappedTie.calculatePrice() + " грн");
        wrappedTie.printDetailedTime();
        System.out.println("Итого: " + wrappedTie.calculateTime() + " дня");

        System.out.println();

        ClothI tShirt = new TShirt(Size.XS, 78, "White");
        ClothI wrappedTShirt = new SimpleWrapperDecorator(tShirt);
        wrappedTShirt.printDetailedPrice();
        System.out.println("Итого: " + wrappedTShirt.calculatePrice() + " грн.");
        wrappedTShirt.printDetailedTime();
        System.out.println("Итого: " + wrappedTShirt.calculateTime() + " дня");
    }
}
