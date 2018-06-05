package newdate.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatLocalDateTimeDemo1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm:ss");
        String date = "июня 5, 2018 12:10:56";
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        System.out.println(localDateTime);
    }
}

