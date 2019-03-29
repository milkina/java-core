package generics;

public class GenericWrongStatic<T> {
    // Неверно, нельзя создать статические переменные типа Т.
    //public static Т оb;

    // Неверно, ни один статический метод не может использовать Т.
/*    public static T getOb() {
        return оb;
    }*/
    //Но объявить статические обобщенные методы со своими параметрами типа можно
    public static <V> void getOb(V v) {
        System.out.println(v);
    }
}
