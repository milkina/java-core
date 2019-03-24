package wrappers;

public class AutoBoxDemo1 {
    public static void main(String[] args) {
        Integer iOb = 100; // упаковать значение int
        int i = iOb; // распаковать
        System.out.println(i + " " + iOb);
    }
}
