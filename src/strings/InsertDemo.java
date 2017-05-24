package strings;

public class InsertDemo {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("I Java!");

        sb.insert(2, "like ");
        System.out.println(sb);
    }
}
