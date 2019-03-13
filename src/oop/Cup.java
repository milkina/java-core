package oop;

public class Cup {
    private Spoon spoon;

    public Cup(Spoon spoon) {
        this.spoon = spoon;
    }

    @Override
    protected void finalize()  {
        System.out.println("Чашка исчезает навсегда");
    }

    public static void main(String[] args) {
        Cup cup = new Cup(new Spoon());
        cup = null;
        System.gc();
     }
}
