package strings;

public class SetCharAtDemo {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("string before = " + sb);
        System.out.println("charAt(1) before = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("string after = " + sb);
        System.out.println("charAt(1) after = " + sb.charAt(1));
    }
}
