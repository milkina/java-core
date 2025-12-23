package collections.homework.pets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetsExample {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Мухтар");
        Parrot parrot = new Parrot("Кеша");

        pets.put(cat.getName(), cat);
        pets.put(dog.getName(), dog);
        pets.put(parrot.getName(), parrot);

        print(pets);
        makeNoise(pets);
    }

    private static void makeNoise(Map<String, Pet> pets) {
        System.out.println("Звуки животных:");
        pets.values().forEach(Pet::makeNoise);
    }

    private static void print(Map<String, Pet> pets) {
        System.out.println("Имена животных:");
        Set<String> keys = pets.keySet();
        keys.forEach(System.out::println);
    }
}
