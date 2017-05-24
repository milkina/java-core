package strings;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.ensureCapacity(50);

        System.out.println("string = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
        System.out.println();

        sb.setLength(100);
        System.out.println("string = [" + sb + "]");
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
        System.out.println();

        sb.setLength(2);
        System.out.println("string = [" + sb + "]");
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
    }
}
