package generics;

public class GenArrays {
    public static void main(String args[]) {
        Integer n[] = {1, 2, 3, 4, 5};
        Gen2<Integer> iOb = new Gen2<>(50, n);
        // Нельзя создать массив специфичных для типа обобщенных ссылок.
        // Gen2<Integer> gens[] = new Gen2<Integer>[10]; // Неверно!
        // Это верно.
        Gen2<?> gens[] = new Gen2<?>[10]; // ОК
        gens[0] = new Gen2<>(34, n);
    }
}
