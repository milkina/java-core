package flow;

public class SwitchDemo3 {
    public static void main(String args[]) {
        int z = 8;
        switch (z) {
            case 1:
                System.out.println("Fall to one");
            default:
                System.out.println("default");
            case 3:
                System.out.println("Fall to three");
            case 4:
                System.out.println("Fall to four");
        }
    }
}
