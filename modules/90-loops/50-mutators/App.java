public class App {
    // BEGIN
    public static String filterString(String str, char symbol) {
        var index = 0;
        var length = str.length();
        var result = "";
        while (index < length) {
            var currentChar = str.charAt(index);
            if (currentChar != symbol) {
                result += currentChar;
            }
            index++;
        }

        return result;
    }
    // END
}
