package inner;

public class Food {
    Potato p = new Potato() {
        public void fry() {
            System.out.println("frying potato anonymously ");
        }

        public void peel() {
            System.out.println("peeling potato anonymously");
        }
    };

    public void prepare() {
        p.peel();
      //  p.fry(); //compilation failure
    }
}
