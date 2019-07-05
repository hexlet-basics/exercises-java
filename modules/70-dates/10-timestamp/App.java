public class App {
    final static var SECONDS_IN_YEAR = 60 * 60 * 24 * 365;

    public static double getYear(int timestamp) {
        // BEGIN
        return 1970 + Math.floor(timestamp/SECONDS_IN_YEAR);
        // END
    }
}
