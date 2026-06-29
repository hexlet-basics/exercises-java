import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    public static void main(String[] args) {
        assertThat(App.convertString("hey")).isEqualTo("yeh");
        assertThat(App.convertString("Hey")).isEqualTo("Hey");
        assertThat(App.convertString("")).isEqualTo("");
    }
}
