package oop.p2;

import oop.p1.Parent;

public class Child extends Parent {
    public void someMethod() {
        publicAccessMethod();
        //defaultAccessMethod();
        protectedAccessMethod();
    }
}
