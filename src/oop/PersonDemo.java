package oop;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFullName("Петров Иван Иванович");
        person.setAge(56);
        person.setRetired(false);

        System.out.println("Полное имя " + person.getFullName());
        System.out.println("Возраст " + person.getAge());
        System.out.println("Пенсионер? " + person.isRetired());
    }
}
