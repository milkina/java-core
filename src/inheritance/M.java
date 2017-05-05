package inheritance;

public class M {
    public int i;
    public int j;

    public M(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void print() {
        System.out.println("Print in M");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
