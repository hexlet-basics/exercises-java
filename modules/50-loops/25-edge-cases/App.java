public class App {
    // BEGIN
    public static boolean isArgumentsForSubstrCorrect(String str, int index, int length) {
        if (index < 0) {
            return false;
        } else if (length < 0) {
            return false;
        } else if (index > str.length() - 1) {
                 return false;
        } else if (index + length > str.length()) {
                return false;
        }
        return true;
    }
    // END
}
