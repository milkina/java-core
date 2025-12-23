package collections.homework.pets;

public class Parrot extends Pet {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кар");
    }
}
