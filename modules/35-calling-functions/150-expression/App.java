public class App {
    public static void main(String[] args) {
        // BEGIN
        var distance = Functions.calculateDistance("Winterfell", "The Twins")
                + Functions.calculateDistance("The Twins", "The Eyrie");
        System.out.println(distance);
        // END
    }
}
