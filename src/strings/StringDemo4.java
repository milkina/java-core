package strings;

public class StringDemo4 {
    public static void main(String args[]) {
        String s = "This is a demo of the getChars method.";
        int start = 5;
        int end = 7;
        char buf[] = new char[end - start];

        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
