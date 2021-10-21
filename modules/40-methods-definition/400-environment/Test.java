import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final String expected = "The age difference is 17";

        final String actual = App.getAgeDifference(2001, 2018);

        assertThat(actual).isEqualTo(expected);
    }
}
