import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final int expected = 35;

        final int actual = App.getParentNamesTotalLength("Daenerys Targaryen");

        assertThat(actual).isEqualTo(expected);
    }
}
