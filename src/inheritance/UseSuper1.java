package inheritance;

public class UseSuper1 {
    public static void main(String[] args) {
        D d = new D("someString", 2);
        d.print();
        d.print("Print:");
        System.out.println(d.i);
    }
}
