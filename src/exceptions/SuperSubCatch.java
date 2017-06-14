package exceptions;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int а = 0;
            int b = 42 / а;
        } catch (Exception е) {
            System.out.println("Перехват исключений общего класса Exception.");
        } /*catch (ArithmeticException e) {
            //ОШИБКА: недостижимый код !
            System.out.println("Этoт код вообще недостижим.");
        }*/
    }
}
