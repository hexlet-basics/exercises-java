public class App {
    public static void main(String[] args) {
        var euros = 100;

        // BEGIN
        var dollars = euros * 1.25;
        System.out.print(dollars);
        System.out.print("\n");
        var rubles = dollars * 60;
        System.out.print(rubles);
        // END
    }
}
