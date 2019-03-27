package strings;

public class AppendDemo {
    public static void main(String[] args) {
        int a = 42;
        StringBuilder sb = new StringBuilder(40);

        String s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
