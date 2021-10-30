import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.hasChar("Renly", 'R')).isTrue();
        assertThat(App.hasChar("Renly", 'r')).isFalse();
        assertThat(App.hasChar("Tommy", 'm')).isTrue();
        assertThat(App.hasChar("Tommy", 'd')).isFalse();
        assertThat(App.hasChar("Tommy", 'y')).isTrue();
    }
}
