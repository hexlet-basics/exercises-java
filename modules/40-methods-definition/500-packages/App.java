import static java.lang.Math.ceil;

public class App {
    public static int amountPerPerson(double total, int people, int tipPercent) {
        // BEGIN
        double withTip = total * (1 + tipPercent / 100.0);
        return (int) ceil(withTip / people);
        // END
    }
}
