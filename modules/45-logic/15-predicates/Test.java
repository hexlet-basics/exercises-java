import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.isNegative(-1)).isTrue();
        assertThat(App.isNegative(0)).isFalse();
        assertThat(App.isNegative(1)).isFalse();
    }
}
