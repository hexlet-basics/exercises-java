import org.apache.commons.lang3.StringUtils;

public class App {
    // BEGIN
    public static boolean isPalindrome(String word) {
        var reversedWord = StringUtils.reverse(word.toLowerCase());
        return reversedWord.equals(word.toLowerCase());
    }
    // END
}
