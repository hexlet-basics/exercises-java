import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.multiplyNumbersFromRange(2, 2)).isEqualTo(2);
        assertThat(App.multiplyNumbersFromRange(1, 3)).isEqualTo(6);
        assertThat(App.multiplyNumbersFromRange(1, 5)).isEqualTo(120);
        assertThat(App.multiplyNumbersFromRange(2, 5)).isEqualTo(120);
        assertThat(App.multiplyNumbersFromRange(0, 5)).isEqualTo(0);
        assertThat(App.multiplyNumbersFromRange(-4, -2)).isEqualTo(-24);
        assertThat(App.multiplyNumbersFromRange(-4, -3)).isEqualTo(12);
    }
}
