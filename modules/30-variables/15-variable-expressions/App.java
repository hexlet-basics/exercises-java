public class App {
    public static void main(String[] args) {
        var eurosCount = 100;

        // BEGIN
        var dollarsCount = eurosCount * 1.25;
        System.out.println(dollarsCount);

        var rublesCount = dollarsCount * 60;
        System.out.println(rublesCount);
        // END
    }
}
