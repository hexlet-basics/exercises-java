public class App {
    public static void main(String[] args) {
        // BEGIN
        System.out.println(Functions.parentFor(Functions.parentFor("Joffrey Baratheon", "mother"), "father"));
        // END
    }
}
