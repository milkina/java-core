package strings;

public class String1 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Java";
        s2 = s1;
        System.out.println("сравнение ссылок " + (s1 == s2)); // результат true
        // создание нового объекта копированием
        s2 = new String(s1);
        System.out.println("сравнение ссылок " + (s1 == s2)); // результат false
        System.out.println("сравнение значений " + s1.equals(s2)); //
    }
}
