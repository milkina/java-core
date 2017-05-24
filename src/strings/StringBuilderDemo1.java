package strings;

public class StringBuilderDemo1 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("string = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
    }
}
