public class App {
    public static String filterString(String str, char ch) {
        // BEGIN
        var i = 0;
        var result = "";
        while (i < str.length()) {
            var currentChar = str.charAt(i);
            if (currentChar != ch) {
                result += currentChar;
            }
            i += 1;
        }

        return result;
        // END
    }
}
