public class App {
    public static String compress(String string) {
        // BEGIN
        if (string.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(i - 1)) {
                count++;
            } else {
                result.append(string.charAt(i - 1));
                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }

        result.append(string.charAt(string.length() - 1));
        if (count > 1) {
            result.append(count);
        }

        return result.toString();
        // END
    }
}
