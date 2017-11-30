package oop;

public class Toy {
    private String name;
    private int cost;

    public Toy(String name, int cost) {
        this(name);
        this.cost = cost;
        System.out.println("In constructor with two parameters");
    }

    public Toy(String name) {
        this();
        this.name = name;
        System.out.println("In constructor with one parameter");
    }

    public Toy() {
        System.out.println("In default constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
