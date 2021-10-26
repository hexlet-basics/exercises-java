import java.time.LocalDate;

public class App {
    // BEGIN
    public static int getCurrentYear() {
        var date = LocalDate.now();
        return Integer.parseInt(date.toString().substring(0, 4));
    }
    // END
}
