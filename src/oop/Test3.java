package oop;

public class Test3 {
    int a;

    public Test3(int i) {
        a = i;
    }

    public Test3 incrementByTen() {
        Test3 temp = new Test3(a + 10);
        return temp;
    }
}
