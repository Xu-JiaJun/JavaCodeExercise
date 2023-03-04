package localDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localDateTimeTest {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        //LocalDateTime to String
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        //String to LocalDateTime
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDateTime.parse("2023-03-05 01:30:30", dateTimeFormatter));
    }
}
