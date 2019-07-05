public class App {
    // BEGIN
    public static String shouter(String str) {
        var length = str.length();
        var result = "";

        if (length > 0 && length < 5) {
            return str;
        } else if (length == 5) {
            var counter = 0;
            var counterLimit = 10;
            while (counter != counterLimit) {
                result += str;
                counter += 1;
            }
        } else {
            var counter = 0;
            var counterLimit = 100;

            while (counter != counterLimit) {
                result += str;
                counter += 1;
            }
        }
        return result;
    }
    // END
}
