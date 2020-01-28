import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.isMister("Mister")).isTrue();
        assertThat(App.isMister("Man")).isFalse();
        assertThat(App.isMister("313")).isFalse();
    }
}
