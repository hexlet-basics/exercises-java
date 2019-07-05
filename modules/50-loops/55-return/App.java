public class App {
    // BEGIN
    public static boolean doesContain(String str, char symbol) {
        var index = 0;
        while (index < str.length()) {
            if (str.charAt(index) == symbol) {
                return true;
            }

            index++;
        }
        return false;
    }
    // END
}
