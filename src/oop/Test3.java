package oop;

public class Test3 {
    int a;

    Test3(int i) {
        a = i;
    }

    Test3 incrementByTen() {
        Test3 temp = new Test3(a + 10);
        return temp;
    }
}
