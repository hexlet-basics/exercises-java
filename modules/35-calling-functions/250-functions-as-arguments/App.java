public class App {
    public static void main(String[] args) {
        // BEGIN
        System.out.print(Functions.parentFor(Functions.parentFor("Joffrey Baratheon", "mother"), "father"));
        // END
    }
}
