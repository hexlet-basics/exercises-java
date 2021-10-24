public class App {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";

        // BEGIN
        var result = "First: "
            + text.charAt(0)
            + "\nLast: "
            + text.charAt(text.length() - 1);

        System.out.println(result);
        // END
    }
}
