package flow;

public class SwitchExample2 {
    public static void main(String[] args) {
        int month = 4;
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Not a Month";
        };
        System.out.println("April is in the " + season + ".");
    }
}
