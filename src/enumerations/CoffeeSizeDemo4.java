package enumerations;

public class CoffeeSizeDemo4 {
    public static void main(String[] args) {
        for (CoffeeSize c : CoffeeSize.values()) {
            System.out.println(c + " " + c.ordinal());
        }
    }
}
