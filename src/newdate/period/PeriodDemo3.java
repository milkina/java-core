package newdate.period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo3 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2000, 2, 10);
        LocalDate localDate2 = LocalDate.of(2001, 4, 12);
        Period difference1 = Period.between(localDate1, localDate2);
        System.out.println(difference1);
    }
}
