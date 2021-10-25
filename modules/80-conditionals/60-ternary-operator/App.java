public class App {
    // BEGIN
    public static String convertString(String string) {
        return Character.isUpperCase(string.charAt(0)) ? string : string.repeat(2);
    }
    // END
}
