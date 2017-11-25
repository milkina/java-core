package generics;

public class Gen2<T extends Number> {
    private T ob;
    private T[] vals; // ОК

    Gen2(T o, T[] nums) {
        ob = o;
        // Этот оператор неверен.
        // vals = new Т[10]; // нельзя создавать массив объектов Т
        // Однако этот оператор верен.
        vals = nums; // можно присвоить ссылку существующему массиву
    }
}

