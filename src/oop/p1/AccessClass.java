package oop.p1;

/**
 * Created by Tatyana on 25.12.2017.
 */
public class AccessClass {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.publicAccessMethod();
        parent.defaultAccessMethod();
        parent.protectedAccessMethod();
    }
}
