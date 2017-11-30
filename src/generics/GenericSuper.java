package generics;

public class GenericSuper<T> {
    private T ob;

    GenericSuper(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }
}
