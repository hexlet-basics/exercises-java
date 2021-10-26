import org.apache.commons.lang3.StringUtils;

public class App {
    // BEGIN
    public static String getHiddenCard(String cardNumber, int starsCount) {
        var visibleDigitsLine = cardNumber.substring(12);
        return StringUtils.leftPad(visibleDigitsLine, starsCount + 4, '*');
    };

    public static String getHiddenCard(String cardNumber) {
        return App.getHiddenCard(cardNumber, 4);
    };
    // END
}
