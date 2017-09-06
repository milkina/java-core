package lesson2;

public class VarDemo {
    String str1 = "Hello!";
    String str2 = "Hi!";

    public static void main(String[] args) {
        int x; // переменная x доступна всему коду из метода main ( )
        x = 10;
        if (x == 10) { // начало новой области действия,
            int у = 20;
            //int x = 45; // ОШИБКА! Во внутреннем блоке кода нельзя
            // объявлять переменные с тем же именем, что и во внешней области действия.
            //обе переменные х и у доступны в этой области действия
            System.out.println(" x и у : " + x + " " + у);
            x = у * 2;
            {
                int z = 34;
                System.out.println(" x и у : " + x + " " + у);
                System.out.println(" z: " + z);
            }
        }
        // y = 100; // ОШИБКА! переменная у недоступна
        // в этой области действия
        // переменная х доступна и эдесь
        System.out.println(" x равно " + x);
    }
}
