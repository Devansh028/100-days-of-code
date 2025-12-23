import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeApiDemo {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate nextWeek = date.plusWeeks(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime.format(formatter));
        System.out.println("Next Week: " + nextWeek);
    }
}
