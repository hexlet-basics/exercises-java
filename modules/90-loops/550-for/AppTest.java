import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    public static void main(String[] args) {
        assertThat(App.encrypt("attack")).isEqualTo("taatkc");
        assertThat(App.encrypt("go!")).isEqualTo("og!");
    }
}
