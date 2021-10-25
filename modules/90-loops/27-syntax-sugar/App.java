public class App {
    // BEGIN
    public static int countChars(String str, char symbol) {
        var index = str.length() - 1;
        var result = 0;
        while (index >= 0) {
            if (str.charAt(index) == symbol) {
                result += 1;
            }
            index -= 1;
        }

        return result;
    }
    // END
}
