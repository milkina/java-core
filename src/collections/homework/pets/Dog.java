package collections.homework.pets;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }
}
