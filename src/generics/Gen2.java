package generics;

public class Gen2<T extends Number> {
    T оb;
    T vals[]; // ОК

    Gen2(T о, T[] nums) {
        оb = о;
        // Этот оператор неверен.
        // vals = new Т[10]; // нельзя создавать массив объектов Т
        // Однако этот оператор верен.
        vals = nums; // можно присвоить ссылку существующему массиву
    }
}

