package newdate.period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo3 {
    public static void main(String[] args) {
        Period dif1 = Period.between(LocalDate.of(2000, 2, 10),
                LocalDate.of(2001, 4, 12));
        Period dif2 = Period.between(LocalDate.of(2013, 5, 9),
                LocalDate.of(2013, 6, 3));
        Period dif3 = Period.between(LocalDate.of(2014, 11, 3),
                LocalDate.of(2012, 10, 31));
        System.out.println(dif1);
        System.out.println(dif2);
        System.out.println(dif3);
    }
}
