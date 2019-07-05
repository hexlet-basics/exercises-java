public class App {
    public static void main(String[] args) throws Exception {
        // BEGIN
        System.out.print(Functions.parentFor(Functions.parentFor("Joffrey Baratheon"), "father"));
        // END
    }
}
