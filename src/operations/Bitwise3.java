package operations;

public class Bitwise3 {
    public static void main(String[] args) {
        int message = 560;
        int maska = 67;
        int codedMessage = message ^ maska;
        int receivedMesssage = codedMessage ^ maska;
        System.out.println("message = " + message);
        System.out.println("message = " + Integer.toBinaryString(message));
        System.out.println("codedMessage = " + codedMessage);
        System.out.println("codedMessage = " + Integer.toBinaryString(codedMessage));
        System.out.println("receivedMesssage = " + receivedMesssage);
        System.out.println("receivedMesssage = " + Integer.toBinaryString(receivedMesssage));
    }
}
