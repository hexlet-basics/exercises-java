import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.startsWith("one", "o")).isTrue();
        assertThat(App.startsWith("one", "ne")).isFalse();
        assertThat(App.startsWith("one", "on")).isTrue();
        assertThat(App.startsWith("one", "one")).isTrue();
    }
}
