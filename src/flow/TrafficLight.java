package flow;

public class TrafficLight {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1 -> System.out.println("Зеленый");
            case 2 -> System.out.println("Желтый");
            case 3 -> {
                System.out.println("Красный");
                System.out.println("Движение запрещено");
            }
            default -> System.out.println("Неправильно введено число");
        }
    }
}
