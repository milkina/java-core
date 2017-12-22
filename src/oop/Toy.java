package oop;

public class Toy {
    String name;
    int cost;

    public Toy(String name, int cost) {
        this(name);
        this.cost = cost;
        System.out.println("В конструкторе с двумя параметрами");
    }

    public Toy(String name) {
        this();
        this.name = name;
        System.out.println("В конструкторе с одним параметром");
    }

    public Toy() {
        System.out.println("В конструкторе по умолчанию");
    }
}
