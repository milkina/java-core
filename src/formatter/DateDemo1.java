package formatter;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("Текущая дата: " + date1);
        System.out.println("Количество мс: " + date1.getTime());

        Date date2 = new Date(12121212);
        System.out.println("Установленная дата: " + date2);
        date2.setTime(34343434);
        System.out.println("Измененная дата: " + date2);
    }
}
