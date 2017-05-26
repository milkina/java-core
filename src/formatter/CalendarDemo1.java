package formatter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();//календарь на текущую дату
        Calendar c2 = new GregorianCalendar(2013, 11, 25);//календарь на 25.11.2013
        c2.add(Calendar.DAY_OF_YEAR, 1); //увеличиваем дату на 1 день
        System.out.println(c2.getTime());// 26.11.2013
        c2.add(Calendar.MONTH, -1);
        System.out.println(c2.getTime());
    }
}
