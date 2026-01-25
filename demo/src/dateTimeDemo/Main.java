package dateTimeDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = d1.plusDays(10);
        System.out.println(d1); // unchanged
        System.out.println(d2); // new object

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        String date = LocalDate.now().format(fmt);
        System.out.println(date);


        LocalDate today1 = LocalDate.now();
        System.out.println(today1.plusDays(10));
        System.out.println(today1.minusMonths(2));
        System.out.println(LocalTime.now().plusHours(3));

    }
}
