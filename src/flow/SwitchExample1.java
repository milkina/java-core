package flow;

public class SwitchExample1 {
    public static void main(String[] args) {
        int month = 4;
        String season = switch (month) {
            case 12, 1, 2:
                yield "Winter";
            case 3, 4, 5:
                yield "Spring";
            case 6, 7, 8:
                yield "Summer";
            case 9, 10, 11:
                yield "Autumn";
            default:
                yield "Not a Month";
        };
        System.out.println("April is in the " + season + ".");
    }
}
