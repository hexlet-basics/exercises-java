import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.sumOfSeries(1, 1)).isEqualTo(1);
        assertThat(App.sumOfSeries(1, 2)).isEqualTo(3);
        assertThat(App.sumOfSeries(7, 9)).isEqualTo(24);
    }
}
