package oop.p2;


import oop.p1.Parent;

public class AccessClass {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.publicAccessMethod();
        //  parent.defaultAccessMethod();
        // parent.protectedAccessMethod();
    }
}
