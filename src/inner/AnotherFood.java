package inner;

public class AnotherFood {
    public static void main(String[] args) {
        Potato potato = new Potato() {
            public void fry() {
                System.out.println("Жарим картошку в анонимном классе.");
            }

            @Override
            public void peel() {
                System.out.println("Чистим картошку в анонимном классе.");
                fry();
            }
        };
        potato.peel();
        //Ошибка компиляции
        //potato.fry();
    }
}
