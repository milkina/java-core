package newdate.period;

import java.time.Period;

public class PeriodDemo1 {
    public static void main(String[] args) {
        // Установить годы, месяца, дни (могут быть отрицательными)
        Period period5y4m3d = Period.of(5, 4, 3);
        // Установить дни (могут быть отрицательными), годы и месяца будут равны нулю
        Period period2d = Period.ofDays(2);
        // Установить месяца (могут быть отрицательными), годы и дни будут равны нулю
        Period period2m = Period.ofMonths(2);
        // Установить недели (могут быть отрицательными). Период будет в днях.
        // Годы и месяца будут равны нулю
        Period period14d = Period.ofWeeks(2);
        // Установить годы (могут быть отрицательными), дни и месяца будут равны нулю.
        Period period2y = Period.ofYears(2);

        System.out.println(period5y4m3d);
        System.out.println(period2d);
        System.out.println(period2m);
        System.out.println(period14d);
        System.out.println(period2y);
    }
}
