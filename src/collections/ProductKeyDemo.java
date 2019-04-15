package collections;

import java.util.HashMap;
import java.util.Map;

public class ProductKeyDemo {
    public static void main(String[] args) {
        Map<Product, String> map = new HashMap<>();
        Product doll = new Product("Кукла", 534, "Украина");
        Product box = new Product("Кубик", 34, "Украина");
        Product car = new Product("Машинка", 200, "Украина");

        map.put(doll, "Антошка");
        map.put(box, "Антошка");
        map.put(car, "Детский мир");

        System.out.println(map.get(doll));
        doll.setCost(434);

        System.out.println(map.get(doll));
    }
}
