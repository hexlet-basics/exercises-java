public class App {
    // BEGIN
    public static String getEvenNumbersUpTo(int num) {
        var counter = 1;
        var result = "";

        while (counter <= num) {
            if (counter % 2 == 0) {
                result = result + counter + ",";
            }

            counter += 1;
        }

        return result;
    }
    // END
}
