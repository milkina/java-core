package inheritance;

public class M {
    public int i;
    public int j;

    public M(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void print() {
        System.out.println("Метод M i = " + i + " j = " + j);
    }
}
