package formatter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo1 {
    public static void main(String[] args) {
        //календарь на текущую дату
        Calendar calendar1 = new GregorianCalendar();
        System.out.println("Календарь на текущую дату: " + calendar1.getTime());

        //календарь на 25.12.2013
        Calendar calendar2 = new GregorianCalendar(2013, 11, 25);
        calendar2.add(Calendar.DAY_OF_YEAR, 1); //увеличиваем дату на 1 день
        // 26.12.2013
        System.out.println("Календарь на 26.12.2013: " + calendar2.getTime());

        calendar2.add(Calendar.MONTH, -1);
        System.out.println("Календарь на 26.11.2013: " + calendar2.getTime());

        calendar2.roll(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Календарь после roll: " + calendar2.getTime());
    }
}
