import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        var formatter = java.time.format.DateTimeFormatter.ofPattern("YYYY");
        var expected = java.time.format(formatter);

        final int actual = App.getCurrentYear();

        assertThat(actual).isEqualTo(expected);
    }
}
