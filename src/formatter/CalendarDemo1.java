package formatter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar calendar1 = new GregorianCalendar();//календарь на текущую дату
        System.out.println("Календарь на текущую дату: " + calendar1.getTime());

        Calendar calendar2 = new GregorianCalendar(2013, 11, 25);//календарь на 25.12.2013
        calendar2.add(Calendar.DAY_OF_YEAR, 1); //увеличиваем дату на 1 день
        System.out.println("Календарь на 26.12.2013: " + calendar2.getTime());// 26.12.2013

        calendar2.add(Calendar.MONTH, -1);
        System.out.println("Календарь на 26.11.2013: " + calendar2.getTime());

        calendar2.roll(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Календарь после roll: " + calendar2.getTime());
    }
}
