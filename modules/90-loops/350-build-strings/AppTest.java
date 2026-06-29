import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    public static void main(String[] args) {
        assertThat(App.reverse("Bran")).isEqualTo("narB");
        assertThat(App.reverse("")).isEqualTo("");
        assertThat(App.reverse("Hexlet")).isEqualTo("telxeH");
    }
}
