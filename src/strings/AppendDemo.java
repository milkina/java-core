package strings;

public class AppendDemo {
    public static void main(String args[]) {
        String s;
        int a = 42;
        StringBuilder sb = new StringBuilder(40);

        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
