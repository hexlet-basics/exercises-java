public class App {
    // BEGIN
    public static String mysubstr(String str, int length)
    {
        var index = 0;
        var result = "";
        while (index < length) {
            var currentChar = str.charAt(index);
            result = result + currentChar;
            index = index + 1;
        }

        return result;
    }
    // END
}
