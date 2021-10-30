public class App {
    public static int countChars(String str, char ch) {
        // BEGIN
        var i = 0;
        var count = 0;
        while (i < str.length()) {
            var currentChar = Character.toLowerCase(str.charAt(i));
            if (currentChar == Character.toLowerCase(ch)) {
                count = count + 1;
            }
            i = i + 1;
        }

        return count;
        // END
    }
}
