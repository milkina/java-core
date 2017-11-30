package oop;

public class Test {
   private int a, b;

   public Test(int i, int j) {
        a = i;
        b = j;
    }

    // return true if o is equal to the invoking object
    boolean equals(Test o) {
        return o.a == a && o.b == b;
    }
}
