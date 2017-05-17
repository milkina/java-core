package oop;

public class Toy {
    private String name;
    private int сost;

    public Toy(String name, int сost) {
        this(name);
        this.сost = сost;
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

    public int getСost() {
        return сost;
    }

    public void setСost(int сost) {
        this.сost = сost;
    }
}
