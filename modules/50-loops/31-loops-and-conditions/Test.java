import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final String str1 = "A";
        final String str2 = "HELLO";
        final String str3 = "HELLO!";

        final String shoutStr1 = "A";
        final String shoutStr2 = "HELLOHELLOHELLOHELLOHELLOHELLOHELLOHELLOHELLOHELLO";
        final String shoutStr3 = "HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!"
                + "HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!"
                + "HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!"
                + "HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!"
                + "HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!"
                + "HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!"
                + "HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!";

        assertThat(App.shouter(str1)).isEqualTo(shoutStr1);
        assertThat(App.shouter(str2)).isEqualTo(shoutStr2);
        assertThat(App.shouter(str3)).isEqualTo(shoutStr3);
    }
}
