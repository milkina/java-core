package oop;

public class PersonDemo3 {
    public static void main(String[] args) {
        Person person1 = new Person("Петров Иван Иванович", 56, false);
        Person person2 = new Person("Петров Иван Иванович", 56, false);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.hashCode() == person2.hashCode());
    }
}
