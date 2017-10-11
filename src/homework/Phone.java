package homework;

/**
 * Created by UITS-Admin on 04.10.2017.
 */
public class Phone {
    String number, model;
    int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + number);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("3232", "Apple", 34);
        Phone phone3 = new Phone();

        phone1.model = "Apple";
        phone1.number = "806767";
        phone1.weight = 45;

        System.out.println(phone1.model + phone1.number + phone1.weight);
        System.out.println(phone2.model + phone3.number + phone2.weight);

        phone1.receiveCall("Masha");
        phone1.receiveCall("Sasha", "23232");
    }
}
