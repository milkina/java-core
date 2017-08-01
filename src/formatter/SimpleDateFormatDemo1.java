package formatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        DateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        DateFormat format2 = new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm");
        System.out.println(format1.format(date)); //25.02.2013 09:03
        System.out.println(format2.format(date)); //День 25 Месяц 02 Год 2013 Время 09:03
    }
}
