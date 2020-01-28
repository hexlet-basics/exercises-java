import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.doesContain("Renly", 'R')).isTrue();
        assertThat(App.doesContain("Renly", 'r')).isFalse();
        assertThat(App.doesContain("Tommy", 'm')).isTrue();
        assertThat(App.doesContain("Tommy", 'd')).isFalse();
    }
}
