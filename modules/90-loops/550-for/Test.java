import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.encrypt("attack")).isEqualTo("taatkc");
        assertThat(App.encrypt("go!")).isEqualTo("og!");
    }
}
