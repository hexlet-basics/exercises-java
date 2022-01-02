public class App {
    // BEGIN
    public static String getHiddenCard(String cardNumber, int starsCount) {
        var visibleDigitsLine = cardNumber.substring(12);
        return "*".repeat(16 - starsCount) + visibleDigitsLine;
    };

    public static String getHiddenCard(String cardNumber) {
        return App.getHiddenCard(cardNumber, 4);
    };
    // END
}
