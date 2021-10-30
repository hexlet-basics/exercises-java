import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.joinNumbersFromRange(2, 2)).isEqualTo("2");
        assertThat(App.joinNumbersFromRange(1, 5)).isEqualTo("12345");
        assertThat(App.joinNumbersFromRange(10, 12)).isEqualTo("101112");
    }
}
