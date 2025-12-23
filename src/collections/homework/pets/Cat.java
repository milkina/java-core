package collections.homework.pets;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мур");
    }
}
