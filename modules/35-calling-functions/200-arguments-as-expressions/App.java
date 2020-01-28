public class App {
    public static void main(String[] args) {
        var from = "The Twins";
        var to = "The Eyrie";

        // BEGIN
        var distance = Functions.calculateDistanceBetweenTowns(from + "-" + to);
        System.out.print(distance);
        // END
    }
}
