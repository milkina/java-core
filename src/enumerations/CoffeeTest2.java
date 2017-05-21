package enumerations;

public class CoffeeTest2 {
    public static void main(String[] args) {
        Coffee3 drink = new Coffee3();
        drink.size = Coffee3.CoffeeSize.BIG; // enclosing class name required
    }
}
