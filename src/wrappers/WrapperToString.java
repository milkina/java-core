package wrappers;

public class WrapperToString {
    public static void main(String[] args) {
        Double double1 = Double.valueOf("4.6");
        System.out.println(double1);

        String string1 = Double.toString(3.14);
        System.out.println(string1);

        String string2 = Long.toString(254, 16); // string2 = "fe"​
        System.out.println(string2);
    }
}
