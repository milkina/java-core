package flow;

public class TrafficLight {
    public static void main(String[] args) {
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("Зеленый");
                break;
            case 2:
                System.out.println("Желтый");
                break;
            case 3:
                System.out.println("Красный");
                break;
            default:
                System.out.println("Неправильно введено число");
                break;
        }
    }
}
