package formatter;

import java.util.Calendar;

public class CalendarDemo2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Месяц " + calendar.get(Calendar.MONTH));
        System.out.println("Год " + calendar.get(Calendar.YEAR));
        System.out.println("Неделя в месяце " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Неделя в году " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("День в году " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("День в месяце " + calendar.get(Calendar.DAY_OF_MONTH));
        if (Calendar.MONDAY == calendar.getFirstDayOfWeek()) {
            System.out.println("Первый день недели - Понедельник");
        }
    }
}
