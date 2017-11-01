package inner;

public class Food {
    Potato p = new Potato() {
        public void fry() {
            System.out.println("Frying potato anonymously.");
        }

        public void peel() {
            System.out.println("Peeling potato anonymously.");
        }
    };

    public void prepare() {
        p.peel();
        //  p.fry(); //compilation failure
    }
}
