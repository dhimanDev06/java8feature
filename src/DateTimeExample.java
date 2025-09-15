import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Current Date
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // Current Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + dateTime);

        // Formatting DateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // Specific Date
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/yyyy/MM");
        LocalDate republicDay = LocalDate.of(1950, Month.JANUARY, 26);
        System.out.println("Republic Day: " + republicDay);
        System.out.println("Republic Day: " + republicDay.format(formatter1));


        // Zoned DateTime (with time zone)
        ZonedDateTime zonedNow = ZonedDateTime.now();
        System.out.println("Zoned DateTime: " + zonedNow);

        // Convert to Tokyo Time Zone
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoTime = zonedNow.withZoneSameInstant(tokyoZone);
        System.out.println("Tokyo Time: " + tokyoTime);
    }
}