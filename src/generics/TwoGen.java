package generics;

public class TwoGen<T, V> {
    private T obT;
    private V obV;

    public TwoGen(T obT, V obV) {
        this.obT = obT;
        this.obV = obV;
    }

    public void showTypes() {
        System.out.println("Тип T: " + obT.getClass().getName());
        System.out.println("Тип V: " + obV.getClass().getName());
    }

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }
}
