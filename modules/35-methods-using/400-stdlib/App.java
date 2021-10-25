import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        // BEGIN
        LocalDate dateBefore = LocalDate.of(2017, Month.MAY, 24);
        LocalDate dateAfter = LocalDate.of(2017, Month.JULY, 29);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println(noOfDaysBetween);
        // END
    }
}
