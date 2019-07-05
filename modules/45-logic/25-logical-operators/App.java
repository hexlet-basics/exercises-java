public class App {
    // BEGIN
    public static boolean isLannisterSoldier(String color, String shield) {
        return ("red".equals(color) && shield == null) || ("lion".equals(shield));
    }
    // END
}
