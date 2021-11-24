import org.apache.commons.lang3.StringUtils;

public class App {
    // BEGIN
    public static boolean isPalindrome(String word) {
        var normalizedWord = word.toLowerCase();
        var reversedWord = StringUtils.reverse(normalizedWord);
        return normalizedWord.equals(reversedWord);
    }
    // END
}
