package wrappers;

public class AutoBoxDemo3 {
    public static void main(String[] args) {
        Integer y = new Integer(567); // make it
        y++; // unwrap it, increment it, rewrap it
        System.out.println("y = " + y); // print it
    }
}
