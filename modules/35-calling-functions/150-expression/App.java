public class App {
    public static void main(String[] args) throws Exception {
        // BEGIN
        var distance = Functions.calculateDistance("Winterfell", "The Twins") + Functions.calculateDistance("The Twins", "The Eyrie");
        System.out.print(distance);
        // END
    }
}
