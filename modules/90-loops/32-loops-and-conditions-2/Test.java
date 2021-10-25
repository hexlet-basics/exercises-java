import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.getEvenNumbersUpTo(9)).isEqualTo("2,4,6,8,");
        assertThat(App.getEvenNumbersUpTo(15)).isEqualTo("2,4,6,8,10,12,14,");
        assertThat(App.getEvenNumbersUpTo(2)).isEqualTo("2,");
    }
}
