package wrappers;

public class AutoBoxDemo4 {
    public static void main(String[] args) {
        Integer y = 567; // make a wrapper
        Integer x = y; // assign a second ref  var to THE wrapper
        System.out.println(y == x); // verify that they refer  to the same object

        y++; // unwrap, use, "rewrap"
        System.out.println(x + " " + y); // print values
        System.out.println(y == x); // verify that they refer to different objects
    }
}
