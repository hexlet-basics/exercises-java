import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final var str1 = "A";
        final var str2 = "HELLO";
        final var str3 = "HELLO!";

        final var shoutStr1 = "A";
        final var shoutStr2 = "HELLOHELLOHELLOHELLOHELLOHELLOHELLOHELLOHELLOHELLO";
        final var shoutStr3 = "HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!HELLO!"
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
