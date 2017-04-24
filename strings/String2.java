package strings;


public class String2 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Java";
        s2 = s1; // переменная ссылается на ту же строку
        System.out.println("сравнение ссылок " + (s1 == s2)); // результат true
        // создание нового объекта добавлением символа
        s1 += '2';
        System.out.println(s1);
        // s1-="a"; //ошибка, вычитать строки нельзя
        // создание нового объекта копированием
        s2 = new String(s1);
        System.out.println("сравнение ссылок " + (s1 == s2)); // результат false
        System.out.println("сравнение значений " + s1.equals(s2)); //
    }
}
