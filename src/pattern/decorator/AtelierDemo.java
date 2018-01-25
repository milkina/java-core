package pattern.decorator;

public class AtelierDemo {
    public static void main(String[] args) {
        ClothI tie = new Tie(Size.S, 56, "Black");
        ClothI wrappedTie = new PostDelivery(new SimpleWrapperDecorator(tie));
        System.out.println("Цена товара: " + wrappedTie.calculatePrice());

        ClothI tShirt = new TShirt(Size.XS, 78, "White");
        ClothI wrappedTShirt = new SimpleWrapperDecorator(tShirt);
        System.out.println("Цена товара: " + wrappedTShirt.calculatePrice());
    }
}
