public class App {
    public static String makeItFunny(String str, int n) {
        // BEGIN
        var i = 0;
        var result = "";
        while (i < str.length()) {
            var current = str.charAt(i);
            if ((i + 1) % n == 0) {
                result = result + Character.toUpperCase(current);
            } else {
                result = result + current;
            }
        i++;
    }

    return result;
    // END
}
}
