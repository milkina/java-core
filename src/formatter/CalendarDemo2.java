package formatter;

import java.util.Calendar;

public class CalendarDemo2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Месяц " + c.get(Calendar.MONTH));
        System.out.println("Год " + c.get(Calendar.YEAR));
        System.out.println("Неделя в месяце " + c.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Неделя в году " + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("День в году " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("День в месяце " + c.get(Calendar.DAY_OF_MONTH));
        if (Calendar.MONDAY == c.getFirstDayOfWeek()) {
            System.out.println("Первый день недели - Понедельник");
        }
    }
}
