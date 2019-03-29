package generics;

public class SimpleGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(88, "Generics");

        twoGen.showTypes();
        System.out.println("Значение T: " + twoGen.getObT());
        System.out.println("Значение V: " + twoGen.getObV());
    }
}
