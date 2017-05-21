package wrappers;

public class AutoBoxDemo2 {
    public static void main(String[] args) {
        Integer y = new Integer(567); // make it
        int x = y.intValue(); // unwrap it
        x++; // use it
        y = new Integer(x); // re-wrap it
        System.out.println("y = " + y); // print it
    }
}
