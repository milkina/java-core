package flow;

public class SwitchDemo2 {
    public static void main(String args[]) {
        String str = "potato";
        switch (str) {
            case "tomato":
                System.out.print("tomato ");
            case "potato":
                System.out.print("potato ");
            case "cucumber":
                System.out.print("cucumber ");
            default:
                System.out.println("any");
        }
    }
}
