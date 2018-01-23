package wrappers;

public class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = new Integer(1000);
        int i = iOb.byteValue(); // распаковать как byte!!!
        System.out.println(i);  // результат -24!!!
    }
}
