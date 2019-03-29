package generics;

public class GenRestriction<T> {
    private T ob;
    private T[] array;

    public GenRestriction(T ob, T[] array) {
        // Недопустимо!!!
        //оb = new Т();
        //array = new Т[10];
        this.ob = ob;
        this.array = array;
    }
}
