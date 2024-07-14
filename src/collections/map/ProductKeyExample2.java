package collections.map;

import collections.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductKeyExample2 {
    public static void main(String[] args) {
        Map<String, Product> map = new HashMap<>();
        Product doll = new Product("Кукла", 534, "Украина");
        Product box = new Product("Кубик", 34, "Украина");
        Product car = new Product("Машинка", 200, "Украина");

        map.put("Кукла", doll);
        map.put("Кубик", box);
        map.put("Машинка", car);
    }
}
